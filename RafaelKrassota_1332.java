import java.util.Scanner;

public class RafaelKrassota_1332 {

    final static Scanner LER = new Scanner(System.in);

    public static int contAcertos(String texto) {
        int acertos = 0;
        char[] testo = texto.toCharArray();

        if (testo[0] == 'o') {
            acertos++;
        }
        if (testo[1] == 'n') {
            acertos++;
        }
        if (testo[2] == 'e') {
            acertos++;
        }

        return acertos;
    }

    public static void main(String[] args) {
        String testo;
        int teste = LER.nextInt();
        int acertos;

        for (int i = 0; i < teste; i++) {
            testo = LER.next();
            if (testo.length() > 3) {
                System.out.println(3);
            }else {
                acertos = contAcertos(testo);
                if (acertos >= 2) {
                    System.out.println(1);
                }else {
                    System.out.println(2);
                }
            }
        }
    }
}