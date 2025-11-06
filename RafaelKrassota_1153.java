import java.util.Scanner;

public class RafaelKrassota_1153 {
    
    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int num = 0;
        int fatorial = 1;

        num = lerInt();

        for(int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);
    }
}