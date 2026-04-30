import java.util.Scanner;

public class RafaelKrassota_1179 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        return TECLADO.nextInt();
    }

    public static void imprimirVetorPar(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("par[%d] = %d\n", i, vetor[i]);
        }
    }

    public static void imprimirRestoVetorPar(int[] vetor, int cont) {
        for (int i = 0; i < cont; i++) {
            if (vetor[i] != 0) {
                System.out.printf("par[%d] = %d\n", i, vetor[i]);
            }
        }
    }

    public static void imprimirRestoVetorImpar(int[] vetor, int cont) {
        for (int i = 0; i < cont; i++) {
            if (vetor[i] != 0) {
                System.out.printf("impar[%d] = %d\n", i, vetor[i]);
            }
        }
    }

    public static void imprimirVetorImpar(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("impar[%d] = %d\n", i, vetor[i]);
        }
    }

    public static void main(String[] args) {
        int[] par = new int[5];
        int[] impar = new int[5];
        int temp = 0;
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < 15; i++) {
            temp = lerInt();

            if (temp % 2 == 0) {
                par[contPar] = temp;
                contPar++;
                if (contPar > 4) {
                    imprimirVetorPar(par);
                    contPar = 0;
                }
            } else {
                impar[contImpar] = temp;
                contImpar++;
                if (contImpar > 4) {
                    imprimirVetorImpar(impar);
                    contImpar = 0;
                }
            }
        }
        imprimirRestoVetorImpar(impar,contImpar);
        imprimirRestoVetorPar(par,contPar);
    }
}