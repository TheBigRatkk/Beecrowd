import java.util.Scanner;

public class RafaelKrassota_1234 {

    final static Scanner LER = new Scanner(System.in);

    public static String mudaLetra(String treco) {

        StringBuilder resultado = new StringBuilder();
        boolean mascula = true;

        for (int i = 0; i < treco.length(); i++) {
            char letra = treco.charAt(i);

            if (Character.isLetter(letra)) {
                if (mascula) {
                    resultado.append(Character.toUpperCase(letra));
                } else {
                    resultado.append(Character.toLowerCase(letra));
                }
                mascula = !mascula;
            } else {
                resultado.append(letra);
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        String treco;

        while (LER.hasNextLine()) {
            treco = LER.nextLine();

            treco = mudaLetra(treco);

            System.out.println(treco);
        }
    }
}