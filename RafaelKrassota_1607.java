import java.util.Scanner;

public class RafaelKrassota_1607 {
    
    final static Scanner LER = new Scanner(System.in);

    public static int contarAvancos(String letras, String compara) {
        int avancos = 0;
        char[] letra = letras.toCharArray();
        char[] comprara = compara.toCharArray();

        for (int i = 0; i < letra.length; i++) {
            while (letra[i] != comprara[i]) {
                letra[i] += 1;

                if (letra[i] > 'z') {
                    letra[i] = 'a';
                }
                avancos++;
            }
        }

        return avancos;
    }

    public static void main(String[] args) {
        String letras;
        String compara;
        int avancos;
        int casoTeste = LER.nextInt();

        for (int i = 0; i < casoTeste; i++) {
            letras = LER.next();
            compara = LER.next();
            
            avancos = contarAvancos(letras, compara);

            System.out.println(avancos);
        }
    }
}