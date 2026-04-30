import java.util.Scanner;

public class RafaelKrassota_1180 {

    public static Scanner TECLADO = new Scanner(System.in);

    public static void imprimir(int menor, int posMenor) {
        System.out.printf("Menor valor: %d\nPosicao: %d\n", menor, posMenor);
    }

    public static int lerInt() {
        return TECLADO.nextInt();
    }

    public static void lerVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerInt();
        }
    }

    public static int acharMenor(int[] vetor) {
        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static int acharPosMenor(int menor, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == menor) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int x;
        int menor;
        int posMenor;
        int[] vetor;

        x = lerInt();
        vetor = new int[x];
        lerVetor(vetor);

        menor = acharMenor(vetor);
        posMenor = acharPosMenor(menor, vetor);

        imprimir(menor, posMenor);
    }
}