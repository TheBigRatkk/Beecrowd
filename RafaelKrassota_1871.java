import java.util.Scanner;

public class RafaelKrassota_1871 {
    
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        String resultado;

        while (true) {
            n1 = LER.nextInt();
            n2 = LER.nextInt();
            
            if (n1 == 0 && n2 == 0) {
                break;
            }

            resultado = Integer.toString(n1 + n2).replace("0", "");

            System.out.println(resultado);
        }
    }
}
