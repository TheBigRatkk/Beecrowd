import java.util.Scanner;

public class RafaelKrassota_1893 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirFase(String fase) {
        System.out.printf("%s\n", fase);
    }

    public static String obterFase(int dia1, int dia2) {
        String fase = "";
        if(dia2 >= 0 && dia2 <= 2) {
            fase = "nova";
        }else if(dia2 >= 97 && dia2 <= 100) {
            fase = "cheia";
        }else if(dia2 > dia1) {
            fase = "crescente";
        }else if(dia2 < dia1) {
            fase = "minguante";
        }
        return fase;
    }

    public static void main(String[] args) {
        String fase = null;
        int dia1 = 0;
        int dia2 = 0;

        dia1 = lerInteiro();
        dia2 = lerInteiro();

        fase = obterFase(dia1, dia2);

        imprimirFase(fase);
    }
}