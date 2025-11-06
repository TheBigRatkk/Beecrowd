import java.util.Scanner;

public class RafaelKrassota_2369 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirValorConta(int valorConta) {
        System.out.printf("%d\n", valorConta);
    }

    public static int obterValorConta(int litros) {
        int valorConta = 7;
        if (litros <= 10) {
            return valorConta;
        } else if (litros <= 30) {
            valorConta += (litros - 10) * 1;
        } else if (litros <= 100) {
            valorConta += (litros - 30) * 2 + 20;
        } else if (litros > 100) {
            valorConta += (litros - 100) * 5 + 140 + 20;
        }
        return valorConta;
    }

    public static void main(String[] args) {
        int litros = 0;
        int valorConta = 0;

        litros = lerInteiro();

        valorConta = obterValorConta(litros);

        imprimirValorConta(valorConta);
    }
}