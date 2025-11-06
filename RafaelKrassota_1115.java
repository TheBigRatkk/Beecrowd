import java.util.Scanner;

public class RafaelKrassota_1115 {
    
    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static String obterQuadrante(int X, int Y) {
        String quadrante = null;
        if(X > 0 && Y > 0) {
            quadrante = "primeiro";
        }else if(X < 0 && Y > 0) {
            quadrante = "segundo";
        }else if(X < 0 && Y < 0) {
            quadrante = "terceiro";
        }else {
            quadrante = "quarto";
        }
        return quadrante;
    }

    public static void main(String[] args) {
        String quadrante = null;
        int X = 0;
        int Y = 0;

        while (true) {
            X = lerInt();
            Y = lerInt();

            if(X == 0 || Y == 0) {
                break;
            }

            quadrante = obterQuadrante(X, Y);

            System.out.println(quadrante);

        }
    }
}