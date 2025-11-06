import java.util.Scanner;

public class RafaelKrassota_1099 {
    
    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int N = 0;
        int X = 0;
        int Y = 0;
        int maior = 0;
        int menor = 0;
        int impares = 0;

        N = lerInteiro();

        for(int i = 0; i < N; i++) {
            impares = 0;
            X = lerInteiro();
            Y = lerInteiro();

            if(X > Y) {
                maior = X;
                menor = Y;
            }else {
                maior = Y;
                menor = X;
            }
            for(int j = menor + 1; j < maior; j++) {
                if((j % 2 == 1)) {
                    impares+= j;
                }
            }
            
            System.out.println(impares);
        }
    }
}
