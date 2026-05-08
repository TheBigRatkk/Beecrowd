import java.util.Scanner;

public class RafaelKrassota_1024 {

    final static Scanner LER = new Scanner(System.in);

    public static void criptografa(char[] testo) {
        pula(testo);
        inverte(testo);
        pulaMeio(testo);
    }

    public static void inverte(char[] testo) {
        char letra;
        for (int i = 0; i < testo.length / 2; i++) {
            letra = testo[i];
            testo[i] = testo[testo.length - i - 1];
            testo[testo.length - i - 1] = letra;
        }
    }

    public static void pula(char[] testo) {
        for (int i = 0; i < testo.length; i++) {
            if ((testo[i] >= 'a' && testo[i] <= 'z') || (testo[i] >= 'A' && testo[i] <= 'Z')) {
                testo[i] += 3;
            }
        }
    }

    public static void pulaMeio(char[] testo) {
        for (int i = testo.length / 2; i < testo.length; i++) {
            testo[i] -= 1;
        }
    }

    public static void main(String[] args) {
        String texto;
        char[] testo;
        int n;

        n = LER.nextInt();
        LER.nextLine();

        for (int i = 0; i < n; i++) {
            texto = LER.nextLine();
            testo = texto.toCharArray();
            criptografa(testo);
            texto = new String(testo);
            System.out.println(texto);
        }
    }
}