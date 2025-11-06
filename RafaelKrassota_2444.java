import java.util.Scanner;

public class RafaelKrassota_2444 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int volume = 0;
        int vezes = 0;

        volume = lerInteiro();
        vezes = lerInteiro();

        for(int i = 0; i < vezes; i++) {
            volume += lerInteiro();
            if(volume > 100) {
                volume = 100;
            }if(volume < 0) {
                volume = 0;
            }
        }

        System.out.println(volume);
    }
}