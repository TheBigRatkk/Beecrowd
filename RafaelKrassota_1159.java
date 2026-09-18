import java.util.Scanner;

public class RafaelKrassota_1159 {

    final static Scanner LER = new Scanner(System.in);

    /*
    Erro: time limit
    Arrumar com StringBuilder
    */
    public static void main(String[] args) {
        int testes = LER.nextInt();
        int n;
        
        for (int i = 0; i < testes; i++) {
            n = LER.nextInt();
            Arvore arvore = new Arvore();

            for (int j = 0; j < n; j++) {
                int num = LER.nextInt();
                arvore.inserir(num);
            }

            System.out.printf("Case %d:\n", i + 1);
            System.out.print("Pre.: ");
            arvore.imprimePre();

            System.out.print("In..: ");
            arvore.imprimeEm();

            System.out.print("Post: ");
            arvore.imprimePos();
            System.out.println();
        }
    }
}

class Arvore {

    No raiz;

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    public No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor > atual.valor) {
            atual.filhoD = inserirRecursivo(atual.filhoD, valor);
        }if (valor < atual.valor) {
            atual.filhoE = inserirRecursivo(atual.filhoE, valor);
        }

        return atual;
    }

    public void imprimePos() {
        imprimirPosOrdem(raiz);
        System.out.println();
    }

    public void imprimeEm() {
        imprimirEmOrdem(raiz);
        System.out.println();
    }

    public void imprimePre() {
        imprimirPreOrdem(raiz);
        System.out.println();
    }

    public void imprimirPreOrdem(No atual) {
        if (atual == null) {
            return;
        }
        System.out.printf("%d ", atual.valor);
        imprimirPreOrdem(atual.filhoE);
        imprimirPreOrdem(atual.filhoD);
    }

    public void imprimirEmOrdem(No atual) {
        if (atual == null) {
            return;
        }
        imprimirEmOrdem(atual.filhoE);
        System.out.printf("%d ", atual.valor);
        imprimirEmOrdem(atual.filhoD);
    }

    public void imprimirPosOrdem(No atual) {
        if (atual == null) {
            return;
        }
        imprimirPosOrdem(atual.filhoE);
        imprimirPosOrdem(atual.filhoD);
        System.out.printf("%d ", atual.valor);
    }
}

class No {

    No filhoE;
    No filhoD;
    int valor;
    
    public No(int valor) {
        this.valor = valor;

        this.filhoE = null;
        this.filhoD = null;
    }

}