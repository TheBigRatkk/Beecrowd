import java.util.Scanner;

public class RafaelKrassota_1017 {
    
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int bunda = LER.nextInt();
        int benis = LER.nextInt();
        double cu = (double) (bunda * benis);

        System.out.printf("%.3f\n", cu / 12);
    }
}