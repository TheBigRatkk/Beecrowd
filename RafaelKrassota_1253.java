import java.util.Scanner;

public class RafaelKrassota_1253 {

    final static Scanner LER = new Scanner(System.in);

    final static char[] ALFABETO =
    {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
    'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static int acharPosAlfa(char letra) {
        for (int i = 0; i < ALFABETO.length; i++) {
            if (letra == ALFABETO[i]) {
                return i;
            }
        }
        return -1;
    }

    public static String decode(char[] cifra, int valorCifra) {
        char[] decodificado = new char[cifra.length];
        int posAlfa;

        for (int i = 0; i < cifra.length; i++) {
            posAlfa = acharPosAlfa(cifra[i]);

            if (posAlfa - valorCifra < 0) {
                posAlfa = 26 - Math.abs(posAlfa - valorCifra);
            }else {
                posAlfa-= valorCifra;
            }

            decodificado[i] = ALFABETO[posAlfa];
        }
        return new String(decodificado);
    }

    public static void main(String[] args) {
        int casoTeste = LER.nextInt();
        int valorCifra;
        char[] cifra;
        String decodificado;

        for (int i = 0; i < casoTeste; i++) {
            cifra = LER.next().toCharArray();
            valorCifra = LER.nextInt();
            decodificado = decode(cifra, valorCifra);
            System.out.println(decodificado);
        }
    }
}
