import java.util.Scanner;

public class RafaelKrassota_1175 {

    public static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        int valor;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static int[] lerVetorInt(int[] veto) {
        for (int i = 0; i < veto.length; i++) {
            veto[i] = lerInt();
        }
        return veto;
    }

    public static void imprimirVetorInt(int[] vetor) {
        int contPrint = 0;
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.printf("N[%d] = %d\n", contPrint, vetor[i]);
            contPrint++;
        }
    }

    public static void main(String[] args) {
        int[] vetor = new int[20];

        lerVetorInt(vetor);
        imprimirVetorInt(vetor);
    }
}