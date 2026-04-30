import java.util.Scanner;

public class RafaelKrassota_1187 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static double lerDouble() {
        return TECLADO.nextDouble();
    }

    public static int lerInt() {
        return TECLADO.nextInt();
    }

    public static char lerChar() {
        return TECLADO.next().charAt(0);
    }

    public static void lerMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = lerDouble();
            }
        }
    }

    public static void imprimirSoma(double soma) {
        System.out.printf("%.1f\n", soma);
    }

    public static void imprimirMedia(double media) {
        System.out.printf("%.1f\n", media);
    }

    public static double somar(double[][] matriz) {
        double soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i < j && i + j < matriz[0].length -1) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    public static double media(double[][] matriz) {
        double soma = 0;
        double media = 0;
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i < j && i + j < matriz[0].length -1) {
                    soma += matriz[i][j];
                    cont++;
                }
            }
        }
        media = soma / cont;
        return media;
    }

    public static void main(String[] args) {
        double[][] matriz = new double[12][12];
        char operacao;
        double somaColuna;
        double mediaColuna;

        operacao = lerChar();
        lerMatriz(matriz);

        if (operacao == 'S') {
            somaColuna = somar(matriz);
            imprimirSoma(somaColuna);
        }else if (operacao == 'M') {
            mediaColuna = media(matriz);
            imprimirMedia(mediaColuna);
        }
    }
}