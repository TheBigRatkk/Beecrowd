import java.util.Scanner;

public class RafaelKrassota_1064 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static double lerReal() {
        double valor = 0;
        valor = TECLADO.nextDouble();
        return valor;
    }

    public static void imprimirMedia(int qtdPos, double media) {
        System.out.printf("%d valores positivos\n%.1f\n", qtdPos, media);
    }

    public static double obterMedia(double somaPos, int qtdPos) {
        double media = 0;
        media = somaPos/qtdPos;
        return media;
    }

    public static void main(String[] args) {
        double media = 0;
        double valorAtual = 0;
        double somaPos = 0;
        int qtdPos = 0;

        for(int i = 0; i < 6; i++) {
            valorAtual = lerReal();
            if(valorAtual > 0) {
                somaPos += valorAtual;
                qtdPos ++;
            }
        }

        media = obterMedia(somaPos, qtdPos);

        imprimirMedia(qtdPos, media);
    }
}
