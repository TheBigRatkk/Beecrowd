import java.util.Scanner;

public class RafaelKrassota_1003 {
    
    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirSoma(int soma) {
        System.out.printf("SOMA = %d\n", soma);
    }

    public static int obterSoma(int A, int B) {
        int soma = 0;
        soma = A + B;
        return soma;
    }
    public static void main(String[] args) {
        int valorA = 0;
        int valorB = 0;
        int soma = 0;

        valorA = lerInteiro();
        valorB = lerInteiro();

        soma = obterSoma(valorA, valorB);

        imprimirSoma(soma);
    } 
}