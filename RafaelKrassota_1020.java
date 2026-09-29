import java.util.Scanner;

public class RafaelKrassota_1020 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = LER.nextInt();
        int anos = n / 365;
        int meses = (n % 365)/ 30;
        int dias = (n % 365)% 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);
    }
}