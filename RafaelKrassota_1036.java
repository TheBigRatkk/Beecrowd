import java.util.Scanner;

public class RafaelKrassota_1036 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static void imprimirRaizes(double raiz1, double raiz2, double delta, double a) {
        if (delta <= 0 || a == 0) {
            System.out.printf("Impossivel calcular\n");
        } else {
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", raiz1, raiz2);
        }
    }

    public static double lerDouble() {
        double valor = 0;
        valor = TECLADO.nextDouble();
        return valor;
    }

    public static double calcularDelta(double a, double b, double c) {
        double delta = 0;
        delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public static double obterRaiz1(double delta, double a, double b) {
        double raiz1 = 0;
        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        return raiz1;
    }

    public static double obterRaiz2(double delta, double a, double b) {
        double raiz2 = 0;
        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        return raiz2;
    }

    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        double delta = 0;
        double raiz1 = 0;
        double raiz2 = 0;

        a = lerDouble();
        b = lerDouble();
        c = lerDouble();

        delta = calcularDelta(a, b, c);
        raiz1 = obterRaiz1(delta, a, b);
        raiz2 = obterRaiz2(delta, a, b);

        imprimirRaizes(raiz1, raiz2, delta, a);
    }
}