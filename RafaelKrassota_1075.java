import java.util.Scanner;

public class RafaelKrassota_1075 {
    
    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int N = 0;
        
        N = lerInt();

        for(int i =0; i < 10000; i++) {
            if(i % N == 2) {
                System.out.println(i);
            }
        }
    }
}