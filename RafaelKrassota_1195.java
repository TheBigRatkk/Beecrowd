import java.util.Scanner;

public class RafaelKrassota_1195 {

    final static Scanner LER = new Scanner(System.in);

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
        } if (valor < atual.valor) {
            atual.filhoE = inserirRecursivo(atual.filhoE, valor);
        }

        return atual;
    }

    public void imprimePos() {
        StringBuilder sb = new StringBuilder();
        imprimirPosOrdem(raiz, sb);
        System.out.println(sb.toString().trim());
    }

    public void imprimeEm() {
        StringBuilder sb = new StringBuilder();
        imprimirEmOrdem(raiz, sb);
        System.out.println(sb.toString().trim());
    }

    public void imprimePre() {
        StringBuilder sb = new StringBuilder();
        imprimirPreOrdem(raiz, sb);
        System.out.println(sb.toString().trim());
    }

    public void imprimirPreOrdem(No atual, StringBuilder sb) {
        if (atual == null) {
            return;
        }
        sb.append(atual.valor).append(" ");
        imprimirPreOrdem(atual.filhoE, sb);
        imprimirPreOrdem(atual.filhoD, sb);
    }

    public void imprimirEmOrdem(No atual, StringBuilder sb) {
        if (atual == null) {
            return;
        }
        imprimirEmOrdem(atual.filhoE, sb);
        sb.append(atual.valor).append(" ");
        imprimirEmOrdem(atual.filhoD, sb);
    }

    public void imprimirPosOrdem(No atual, StringBuilder sb) {
        if (atual == null) {
            return;
        }
        imprimirPosOrdem(atual.filhoE, sb);
        imprimirPosOrdem(atual.filhoD, sb);
        sb.append(atual.valor).append(" ");
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