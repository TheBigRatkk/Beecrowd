import java.util.Scanner;

public class RafaelKrassota_1240 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int teste = LER.nextInt();
        String texto1;
        String texto2;

        for (int i = 0; i < teste; i++) {
            texto1 = LER.next();
            texto2 = LER.next();

            if (texto1.endsWith(texto2)) {
                System.out.println("encaixa");
            }else {
                System.out.println("nao encaixa");
            }
        }
    }
}
