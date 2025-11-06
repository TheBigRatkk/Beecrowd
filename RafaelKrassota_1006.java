import java.util.Scanner;

public class RafaelKrassota_1006 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static void imprimirMedia(double media) {
        System.out.printf("MEDIA = %.1f\n", media);
    }

    public static double lerDouble() {
        double valor = 0;
        valor = TECLADO.nextDouble();
        return valor;
    }

    public static double calcularMedia(double A, double B, double C) {
        double media = 0;
        media = ((A * 2) + (B * 3) + (C * 5)) / 10;
        return media;
    }

    public static void main(String[] args) {

        double A = 0;
        double B = 0;
        double C = 0;
        double media = 0;

        A = lerDouble();
        B = lerDouble();
        C = lerDouble();

        media = calcularMedia(A, B, C);

        imprimirMedia(media);
    }
}