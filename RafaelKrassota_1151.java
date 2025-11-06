import java.util.Scanner;

public class RafaelKrassota_1151 {
    
    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int atual = 0;
        int anterior = 1;
        int anteterior = 0;
        int qtdPrints = 0;

        qtdPrints = lerInt();

        System.out.printf("%d ", anteterior);
        System.out.printf("%d ", anterior);

        for(int i = 1; i <= qtdPrints - 2; i++) {
            atual = anterior + anteterior;
            if(i == qtdPrints - 2) {
                System.out.println(atual);
            }else {
                System.out.printf("%d ", atual);
            }
            anteterior = anterior;
            anterior = atual;
        }
    }
}