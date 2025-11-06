import java.util.Scanner;

public class RafaelKrassota_1004 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirProduto(int prod) {
        System.out.printf("PROD = %d\n", prod);
    }

    public static int obterProduto(int A, int B) {
        int prod = 0;
        prod = A * B;
        return prod;
    }

    public static void main(String[] args) {
        int prod = 0;
        int valorA = 0;
        int valorB = 0;

        valorA = lerInteiro();
        valorB = lerInteiro();

        prod = obterProduto(valorA, valorB);

        imprimirProduto(prod);
    }
}