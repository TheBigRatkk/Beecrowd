import java.util.Scanner;
import java.util.HashMap;
import java.util.Locale;

public class RafaelKrassota_1281 {

    final static Scanner LER = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        int nTestes;
        int qtdProd;
        int qtdComprados;
        HashMap<String, Double> produtos = new HashMap<>();

        nTestes = LER.nextInt();

        for (int i = 0; i < nTestes; i++) {
            double total = 0;
            qtdProd = LER.nextInt();

            for (int j = 0; j < qtdProd; j++) {
                String prod = LER.next();
                double valor = LER.nextDouble();

                produtos.put(prod, valor);
            }

            qtdComprados = LER.nextInt();
            
            for (int j = 0; j < qtdComprados; j++) {
                String prod = LER.next();
                int qtd = LER.nextInt();
                
                if (produtos.containsKey(prod)) {
                    total += produtos.get(prod) * qtd;
                }
            }

            System.out.printf("R$ %.2f\n", total);
        }
    }
}
