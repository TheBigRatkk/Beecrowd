import java.util.Scanner;

public class RafaelKrassota_1253 {

    final static Scanner LER = new Scanner(System.in);

    final static char[] ALFABETO =
    {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

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
                posAlfa = 25 - Math.abs(posAlfa - valorCifra);
            }

            decodificado[i] = ALFABETO[posAlfa];
        }
        return decodificado.toString();
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
