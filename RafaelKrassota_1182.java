import java.util.Scanner;

public class RafaelKrassota_1182 {

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

    public static double somarColuna(int coluna, double[][] matriz) {
        double soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][coluna];
        }

        return soma;
    }
    
    public static double mediaColuna(int coluna, double[][] matriz) {
        double soma = 0;
        double media;

        for (int i = 0; i < matriz[0].length; i++) {
            soma += matriz[i][coluna];
        }

        media = soma / matriz[0].length;

        return media;
    }

    public static void main(String[] args) {
        double[][] matriz = new double[12][12];
        int coluna;
        char operacao;
        double somaColuna;
        double mediaColuna;

        coluna = lerInt();
        operacao = lerChar();
        lerMatriz(matriz);

        if (operacao == 'S') {
            somaColuna = somarColuna(coluna, matriz);
            imprimirSoma(somaColuna);
        }else if (operacao == 'M') {
            mediaColuna = mediaColuna(coluna, matriz);
            imprimirMedia(mediaColuna);
        }
    }
}