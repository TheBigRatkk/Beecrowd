import java.util.TreeSet;
import java.util.Scanner;

public class RafaelKrassota_2729 { 
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int teste = LER.nextInt();
        LER.nextLine();
        
        String texto;
        TreeSet<String> lista;

        for (int i = 0; i < teste; i++) {
            texto = LER.nextLine();
            lista = new TreeSet<>();
            String[] linha = texto.split(" ");

            for (String palavra : linha) {
                lista.add(palavra);
            }

            System.out.println(String.join(" ", lista));
        }

    }
}