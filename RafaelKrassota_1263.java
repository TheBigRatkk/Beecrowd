import java.util.Scanner;

public class RafaelKrassota_1263 {

    final static Scanner LER = new Scanner(System.in);

    public static int contarAliteracoes(String testo) {
        int aliteracoes = 0;
        int contAlit = 1;
        char[] texto = testo.toCharArray();
        char letrAlitera = texto[0];

        for (int i = 1; i < texto.length; i++) {
            if (Character.isWhitespace(texto[i - 1])) {
                if (texto[i] == letrAlitera) {
                    contAlit++;
                } else {
                    letrAlitera = texto[i];
                    if (contAlit >= 2) {
                        aliteracoes++;
                        contAlit = 1;
                    }
                }
            }
        }

        if (contAlit >= 2) {
            aliteracoes++;
        }

        return aliteracoes;
    }

    public static void main(String[] args) {
        String texto;
        int aliteracoes;

        while (LER.hasNext()) {
            texto = LER.nextLine();

            aliteracoes = contarAliteracoes(texto.toLowerCase());

            System.out.println(aliteracoes);
        }
    }
}