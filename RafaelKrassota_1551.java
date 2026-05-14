import java.util.Scanner;

public class RafaelKrassota_1551 { // No Beecrowd sempre use Main
    
    final static Scanner LER = new Scanner(System.in);

    public static int verQuantasLetrasTem(char[] trem) {
        int letras = 0;
        int posVet;
        boolean[] simOuNaoPessoal = new boolean[26];

        for (int i = 0; i < trem.length; i++) {
            // Verifica se é uma letra minúscula antes de calcular a posição
            if (trem[i] >= 'a' && trem[i] <= 'z') { 
                posVet = trem[i] - 'a';

                if (!simOuNaoPessoal[posVet]) {
                    simOuNaoPessoal[posVet] = true; // Use posVet aqui, não i
                    letras++;
                }
            }
        }
        return letras;
    }

    public static void main(String[] args) {
        if (LER.hasNextInt()) {
            int nTeste = LER.nextInt();
            LER.nextLine(); // "Limpa" o buffer do Enter para não pular a primeira frase

            for (int i = 0; i < nTeste; i++) {
                String frase = LER.nextLine();

                int letrasQueTem = verQuantasLetrasTem(frase.toCharArray());

                if (letrasQueTem == 26) {
                    System.out.println("frase completa");
                } else if (letrasQueTem >= 13) {
                    System.out.println("frase quase completa");
                } else {
                    System.out.println("frase mal elaborada");
                }
            }
        }
    }
}