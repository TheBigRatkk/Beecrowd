import java.util.ArrayList;
import java.util.Scanner;

public class RafaelKrassota_1030 {

    final static Scanner LER = new Scanner(System.in);

    public static void preencherVet(ArrayList<Integer> pessoas, int n) {
        for (int i = 0; i < n; i++) {
            pessoas.add(i, i + 1);
        }
    }

    public static Integer oQueSobrou(ArrayList<Integer> pessoas, int pulos) {
        int totalMortos = 0;
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.size() == 1) {
                return pessoas.get(i);
            }
            if (i + 1 == pessoas.size()) {
                i = 0;
            }
            pessoas.remove(i -1 + pulos);
            totalMortos++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int teste = LER.nextInt();
        int n;
        int pulos;
        ArrayList<Integer> pessoas;
        Integer sobra;

        for (int i = 0; i < teste; i++) {
            n = LER.nextInt();
            pulos = LER.nextInt();
            pessoas = new ArrayList<>(n);
            preencherVet(pessoas, n);
            sobra = oQueSobrou(pessoas, pulos);
            System.out.printf("Case %d: %d", i + 1, sobra);
        }
    }
}
