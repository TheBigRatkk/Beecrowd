import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class RafaelKrassota_1261 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int nPalavras;
        int ntexto;
        HashMap<String, Integer> dicionario = new HashMap<>();

        nPalavras = LER.nextInt();
        ntexto = LER.nextInt();

        while (LER.hasNext()) {
            for (int i = 0; i < nPalavras; i++) {
                String palavra = LER.next();
                int valor = LER.nextInt();

                dicionario.put(palavra, valor);
            }

            for (int i = 0; i < ntexto; i++) {
                ArrayList<String> texto = new ArrayList<>();
                int soma = 0;

                while (true) {
                    String palavra = LER.next();

                    if (palavra.equals(".")) {
                        break;
                    }

                    texto.add(palavra);
                }

                for (String string : texto) {
                    soma += dicionario.getOrDefault(string, 0);
                }

                System.out.println(soma);
            }
        }
    }
}