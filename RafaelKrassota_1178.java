import java.util.Scanner;

public class RafaelKrassota_1178 {
    
    public static Scanner TECLADO = new Scanner(System.in);

    public static double lerReal() {
        double valor;
        valor = TECLADO.nextDouble();
        return valor;
    }

    public static void decomporVetorDouble(double[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            vetor[i + 1] = vetor[i] / 2;
        }
    }

    public static void imprimirVetorDouble(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("N[%d] = %.4f\n", i, vetor[i]);
        }
    }

    public static void main(String[] args) {
        double[] vetor = new double[100];
        double N = 0;

        N = lerReal();
        vetor[0] = N;
        decomporVetorDouble(vetor);
        imprimirVetorDouble(vetor);
    }
}