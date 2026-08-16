import java.util.Scanner;
import java.util.TreeMap;

public class RafaelKrassota_1260 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int testes = LER.nextInt();
        LER.nextLine();
        LER.nextLine();

        for (int i = 0; i < testes; i++) {
            TreeMap<String, Integer> arvores = new TreeMap<>();
            int totalArvores = 0;
            String arvore;

            while (LER.hasNextLine()) {
                arvore = LER.nextLine();

                if (arvore.isEmpty()) {
                    break;
                }

                arvores.put(arvore, arvores.getOrDefault(arvore, 0) + 1);
                totalArvores++;
            }

            for (String nome : arvores.keySet()) {
                int qtd = arvores.get(nome);

                double porcentagem = ((double) qtd / totalArvores) * 100.0;

                System.out.printf("%s %.4f\n",nome, porcentagem);
            }

            if(i < testes -1) {
                System.out.println();
            }
        }
    }
}