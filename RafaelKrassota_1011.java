import java.util.Scanner;

public class RafaelKrassota_1011 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static void imprimirVolume(double volume) {
        System.out.printf("VOLUME = %.3f\n", volume);
    }

    public static double lerDouble() {
        double valor = 0;
        valor = TECLADO.nextDouble();
        return valor;
    }

    public static double calcularVolume(double raio) {
        double volume = 0;
        double PI = 3.14159;
        volume = (4.0/3.0) * PI * Math.pow(raio, 3);
        return volume;
    }

    public static void main(String[] args) {
        double volume = 0;
        double raio = 0;

        raio = lerDouble();

        volume = calcularVolume(raio);

        imprimirVolume(volume);
    }
}