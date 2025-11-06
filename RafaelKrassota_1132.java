import java.util.Scanner;

public class RafaelKrassota_1132 {
    
    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int valor1 = 0;
        int valor2 = 0;
        int maior = 0;
        int menor = 0;
        int somaValores = 0;

        valor1 = lerInt();
        valor2 = lerInt();

        if(valor1 > valor2) {
            maior = valor1;
            menor = valor2;
        }else {
            menor = valor2;
            maior = valor1;
        }

        for(int i = menor; i <= maior; i++) {
            if(i % 13 != 0) {
                somaValores += i;
            }
        }

        System.out.println(somaValores);
    }
}