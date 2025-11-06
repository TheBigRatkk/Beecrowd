import java.util.Scanner;

public class RafaelKrassota_1060 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static double lerReal() {
        double valor = 0;
        valor = TECLADO.nextDouble();
        return valor;
    }

    public static void imprimirPositivos(int qtdPos) {
        System.out.printf("%d valores positivos\n", qtdPos);
    }

    public static int obterValoresPos(double valor) {
        int valoresPos = 0;
        if(valor > 0){
            valoresPos ++;
        }
        return valoresPos;
    }

    public static void main(String[] args) {
        double valor = 0;
        int valoresPos = 0;

        for(int i = 0; i < 6.; i++) {
            valor = lerReal();
            valoresPos += obterValoresPos(valor);
        }

        imprimirPositivos(valoresPos);
    }
}