import java.util.Scanner;

public class RafaelKrassota_1241 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int nTeste = LER.nextInt();
        String num1;
        String num2;

        for (int i = 0; i < nTeste; i++) {
            num1 = LER.next();
            num2 = LER.next();

            if (num1.contains(num2)) {
                System.out.println("encaixa");
            }else {
                System.out.println("nao encaixa");
            }
        }
    }
}