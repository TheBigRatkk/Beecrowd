import java.util.Scanner;

public class RafaelKrassota_1272 {

    final static Scanner LER = new Scanner(System.in);

    public static String acharSecreto(String texto) {
        StringBuilder segreto = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (Character.isLetter(letra)) {
                if (i == 0) {
                    segreto.append(letra);
                }else if (texto.charAt(i - 1) == ' ') {
                    segreto.append(letra);
                }
            }
        }

        return segreto.toString();
    }

    public static void main(String[] args) {
        int teste = LER.nextInt();
        LER.nextLine();
        String testo;

        for (int i = 0; i < teste; i++) {
            testo = LER.nextLine();

            testo = acharSecreto(testo);

            System.out.println(testo);
        }
    }
}