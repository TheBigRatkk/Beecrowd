import java.util.Scanner;

public class RafaelKrassota_1181 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static double lerDouble() {
        return TECLADO.nextDouble();
    }

    public static int lerInt() {
        return TECLADO.nextInt();
    }

    public static char lerChar() {
        return TECLADO.next().trim().charAt(0);
    }

    public static void lerMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = lerDouble();
            }
        }
    }
    
    public static void lerLinha(int linha, double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerDouble();
        }
    }

    public static void imprimirSoma(double soma) {
        System.out.printf("%.1f\n", soma);
    }

    public static void imprimirMedia(double media) {
        System.out.printf("%.1f\n", media);
    }

    public static double somarLinha(int linha, double[][] matriz) {
        double soma = 0;

        for (int i = 0; i < matriz[0].length; i++) {
            soma += matriz[linha][i];
        }

        return soma;
    }
    
    public static double mediaLinha(int linha, double[][] matriz) {
        double soma = 0;
        double media;

        for (int i = 0; i < matriz[0].length; i++) {
            soma += matriz[linha][i];
        }

        media = soma / matriz[0].length;

        return media;
    }

    public static void main(String[] args) {
        double[] linha_dados = new double[12];
        int linha;
        char operacao;
        double somaLinha;
        double mediaLinha;

        linha = lerInt();
        operacao = lerChar();
        lerLinha(linha, linha_dados);

        if (operacao == 'S') {
            somaLinha = 0;
            for (int i = 0; i < linha_dados.length; i++) {
                somaLinha += linha_dados[i];
            }
            imprimirSoma(somaLinha);
        } else if (operacao == 'M') {
            mediaLinha = 0;
            for (int i = 0; i < linha_dados.length; i++) {
                mediaLinha += linha_dados[i];
            }
            mediaLinha = mediaLinha / linha_dados.length;
            imprimirMedia(mediaLinha);
        }
    }
}