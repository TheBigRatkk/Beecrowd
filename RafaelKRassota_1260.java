import java.util.Scanner;
import java.util.TreeMap;

public class RafaelKRassota_1260 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        TreeMap<String, Integer> arvores = new TreeMap<>();
        int testes = LER.nextInt();

        for (int i = 0; i < testes; i++) {
            String arvore = LER.next();
            int totalArvores = 0;

            arvores.put(arvore, arvores.getOrDefault(arvore, 0) + 1);
            
        }
    }
}