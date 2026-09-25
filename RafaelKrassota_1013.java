import java.util.Scanner;

public class RafaelKrassota_1013 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        int maior = 0;

        a = LER.nextInt();
        b = LER.nextInt();
        c = LER.nextInt();

        maior = Integer.max(a, b);
        maior = Integer.max(maior, c);

        System.out.printf("%d eh o maior\n", maior);
    }  
}