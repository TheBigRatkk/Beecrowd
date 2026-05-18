import java.util.Scanner;

public class RafaelKrassota_1263 {

    final static Scanner LER = new Scanner(System.in);

    public static String deixarIniciais(String texto) {
        StringBuilder testo = new StringBuilder(texto);

        for (int i = 0; i < testo.length(); i++) {
            if (Character.isLowerCase(testo.charAt(i))) {
                testo.deleteCharAt(i);
            }
        }

        return new String(testo);
    }

    public static void marcarIniciais(String texto) {

        for (int i = 0; i < texto.length(); i++) {
            if (i == 0) {
                if (!Character.isWhitespace(texto.charAt(i))) {
                    Character.toUpperCase(texto.charAt(i));
                }
            }else if (Character.isWhitespace(texto.charAt(i - 1))) {
                Character.toUpperCase(texto.charAt(i));
            }else {
                Character.toLowerCase(texto.charAt(i));
            }
        }

    }

    public static int contarAliteracoes(String texto) {
        int aliteracoes = 0;
        int vezesAliteradas = 0;
        char letra = texto.charAt(0);

        for (int i = 0; i < texto.length(); i++) {
            char letraAtual = texto.charAt(i);
            if (letraAtual == letra) {
                vezesAliteradas++;
            }else {
                if (vezesAliteradas > 2) {
                    aliteracoes++;
                }
                letra = texto.charAt(i);
            }
        }

        return aliteracoes;
    }

    public static void main(String[] args) {
        String texto;
        int aliteracoes;

        while (LER.hasNext()) {
            texto = LER.next();

            marcarIniciais(texto);
            texto = deixarIniciais(texto);
            aliteracoes = contarAliteracoes(texto);

            System.out.println(aliteracoes);
        }
    }
}