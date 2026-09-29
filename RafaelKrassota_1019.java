import java.util.Scanner;

public class RafaelKrassota_1019 {

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int n = LER.nextInt();
        int horas = n / 3600;
        int minutos = (n % 3600) / 60;
        int segundos = n % 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}