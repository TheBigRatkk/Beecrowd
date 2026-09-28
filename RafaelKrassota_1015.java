import java.util.Scanner;

public class RafaelKrassota_1015 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        double x1, y1, x2, y2;
        double distancia;

        x1 = LER.nextDouble();
        y1 = LER.nextDouble();
        x2 = LER.nextDouble();
        y2 = LER.nextDouble();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distancia);
    }   
}
