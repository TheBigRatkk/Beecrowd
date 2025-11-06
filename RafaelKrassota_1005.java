import java.util.Scanner;

public class RafaelKrassota_1005 {
    
    final static Scanner TECLADO = new Scanner(System.in);

    public static double lerDouble() {
        double valor = 0;
        valor = TECLADO.nextDouble();
        return valor;
    }

    public static void imprimirMedia(double media) {
        System.out.printf("MEDIA = %.5f\n", media);
    }

    public static double obterMedia(double A, double B) {
        double media = 0;
        media = ((A * 3.5) + (B * 7.5)) / 11;
        return media;
    }

    public static void main(String[] args) {
        double media = 0;
        double valorA = 0;
        double valorB = 0;

        valorA = lerDouble();
        valorB = lerDouble();

        media = obterMedia(valorA, valorB);

        imprimirMedia(media);
    }
}