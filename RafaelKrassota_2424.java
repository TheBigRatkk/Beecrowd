import java.util.Scanner;

public class RafaelKrassota_2424 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirOndeCaiu(String caiu) {
        System.out.printf("%s\n", caiu);
    }

    public static String caiuNaQuadra(int X, int Y) {
        String caiu = null;
        if((X < 0) || (Y < 0 ) || (X > 432) || (Y > 468)) {
            caiu = "fora";
        }else {
            caiu = "dentro";
        }
        return caiu;
    }

    public static void main(String[] args) {
        int X = 0;
        int Y = 0;
        String caiu = null;

        X = lerInteiro();
        Y = lerInteiro();

        caiu = caiuNaQuadra(X, Y);

        imprimirOndeCaiu(caiu);
    }
}
