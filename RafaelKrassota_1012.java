import java.util.Scanner;

public class RafaelKrassota_1012 {

    static double PI = 3.14159;

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c;
        double areaTri;
        double areaCir;
        double areaTra;
        double areaQua;
        double areaRet;

        a = LER.nextDouble();
        b = LER.nextDouble();
        c = LER.nextDouble();

        areaTri = (a * c) / 2;
        areaCir = PI * Math.pow(c, 2);
        areaTra = ((a + b) * c) / 2;
        areaQua = b * b;
        areaRet = a * b;

        System.out.printf("TRIANGULO: %.3f\n", areaTri);
        System.out.printf("CIRCULO: %.3f\n", areaCir);
        System.out.printf("TRAPEZIO: %.3f\n", areaTra);
        System.out.printf("QUADRADO: %.3f\n", areaQua);
        System.out.printf("RETANGULO: %.3f\n", areaRet);
    }
}