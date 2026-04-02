import java.util.Scanner;

public class RafaelKrassota_1173 {

    public static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        return TECLADO.nextInt();
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
    }

    public static void preencherVetor(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = vetor[i - 1] * 2;
        }
    }
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int V;

        V = lerInt();
        vetor[0] = V;

        preencherVetor(vetor);

        imprimirVetor(vetor);
    }
}