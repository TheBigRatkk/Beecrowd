import java.util.Scanner;

public class RafaelKrassota_1142 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int numLinha = 0;
        int numeros = 1;

        numLinha = lerInt();

        for(int i = 0; i < numLinha; i++) {
            for(int j = 0; j < 4; j++) {
                if(numeros % 4 == 0) {
                    System.out.printf("PUM\n");
                }else {
                    System.out.printf("%d ", numeros);
                }
                numeros++;
            }
        }
    }
}