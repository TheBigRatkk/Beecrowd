import java.util.Scanner;

public class RafaelKrassota_1176 {
    
    public static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        return TECLADO.nextInt();
    }

    public static void imprimirFibo(int[] vetor, int n) {
        System.out.printf("Fib(%d) = %d\n", n, vetor[n]);
    }

    public static void preencherVetFibonacci(int[] vet) {
        for (int i = 2; i < vet.length; i++) {
            vet[i] = vet[i - 2] + vet[i - 1];
        }
    }

    public static void casoTeste() {
        int nFibo;
        int[] fibonacci;

        nFibo = lerInt();
        fibonacci = new int[nFibo];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        preencherVetFibonacci(fibonacci);
        imprimirFibo(fibonacci, nFibo);
    }

    public static void main(String[] args) {
        int nTeste;

        nTeste = lerInt();

        for (int i = 0; i < nTeste; i++) {
            casoTeste();
        }
    }
}