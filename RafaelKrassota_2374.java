import java.util.Scanner;

public class RafaelKrassota_2374 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirPressao(int diferenca) {
        System.out.printf("%d\n", diferenca);
    }

    public static int calcularDiferenca(int psDesejada, int psLida) {
        int diferenca = 0;
        diferenca = psDesejada - psLida;
        return diferenca;
    }

    public static void main(String[] args) {
        int psDesejada = 0;
        int psLida = 0;
        int diferenca = 0;

        psDesejada = lerInteiro();
        psLida = lerInteiro();

        diferenca = calcularDiferenca(psDesejada, psLida);

        imprimirPressao(diferenca);
    }
}