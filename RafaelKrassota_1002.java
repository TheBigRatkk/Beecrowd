import java.util.Scanner;

public class RafaelKrassota_1002 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static void imprimirArea(double area) {
        System.out.printf("A=%.4f\n", area);
    }

    public static double lerDouble() {
        double valor = 0;
        valor = TECLADO.nextDouble();
        return valor;
    }

    public static double calcularAreaCircunferncia(double raio) {
        double area = 0;
        double PI = 3.14159;
        area = PI * Math.pow(raio, 2);
        return area;
    }

    public static void main(String[] args) {

        double raio = 0;
        double area = 0;

        raio = lerDouble();
        area = calcularAreaCircunferncia(raio);

        imprimirArea(area);
    }

}