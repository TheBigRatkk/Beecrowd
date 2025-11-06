import java.util.Scanner;

public class RafaelKrassota_1114 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int senha = 0;

        while(true) {
            senha = lerInt();
            if(senha == 2002) {
                System.out.println("Acesso Permitido");
                break;
            }else {
                System.out.println("Senha Invalida");
            }
        }
    }
}