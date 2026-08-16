import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RafaelKrassota_1025 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int nums;
        int consultas;
        int cont = 1;
        ArrayList<Integer> vet;

        while (true) {
            nums = LER.nextInt();
            consultas = LER.nextInt();

            if (nums == 0 && consultas == 0) {
                break;
            }

            vet = new ArrayList<>(nums);
            for (int i = 0; i < nums; i++) {
                vet.add(LER.nextInt());
            }

            Collections.sort(vet);

            System.out.printf("CASE# %d:\n", cont);

            for (int i = 0; i < consultas; i++) {
                int consulta = LER.nextInt();
                int index = Collections.binarySearch(vet, consulta);

                if (index < 0) {
                    System.out.printf("%d not found\n", consulta);
                } else {
                    System.out.printf("%d found at %d\n", consulta, index + 1);
                }
            }

            cont++;
        }
    }
}