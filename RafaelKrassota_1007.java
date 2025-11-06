import java.util.Scanner;

public class RafaelKrassota_1007 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirDiferenca(int diferenca) {
        System.out.printf("DIFERENCA = %d\n", diferenca);
    }

    public static int obterDifernca(int A, int B, int C, int D) {
        int diferenca = 0;
        diferenca = (A * B) - (C * D);
        return diferenca;
    }

    public static void main(String[] args) {
        int valorA = 0;
        int valorB = 0;
        int valorC = 0;
        int valorD = 0;
        int diferenca = 0;

        valorA = lerInteiro();
        valorB = lerInteiro();
        valorC = lerInteiro();
        valorD = lerInteiro();

        diferenca =obterDifernca(valorA, valorB, valorC, valorD);

        imprimirDiferenca(diferenca);
    }
}