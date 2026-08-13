import java.util.Scanner;
import java.util.HashSet;

public class RafaelKRassota_2653 {
    
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        HashSet<String> tesouro = new HashSet<>();

        while (LER.hasNext()) {
            String joia = LER.nextLine();

            tesouro.add(joia);
        }

        System.out.println(tesouro.size());
    }
}