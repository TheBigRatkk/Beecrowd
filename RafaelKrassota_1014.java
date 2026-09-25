import java.util.Scanner;

public class RafaelKrassota_1014 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int dist;
        double valor;
        double medio;

        dist = LER.nextInt();
        valor = LER.nextDouble();

        medio = dist / valor;

        System.out.printf("%.3f km/l\n", medio);
    }
}