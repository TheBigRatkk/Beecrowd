import java.util.Scanner;

public class RafaelKrassota_1174 {
    
    public static Scanner TECLADO = new Scanner(System.in);

    public static double lerDouble() {
        return TECLADO.nextDouble();
    }

    public static void lerVetDouble(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerDouble();
        }
    }

    public static void imprimirVetor(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, vetor[i]);
            }
        }
    }

    public static void main(String[] args) {
        double[] vetor = new double[100];

        lerVetDouble(vetor);
        imprimirVetor(vetor);
    }
}