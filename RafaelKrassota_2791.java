import java.util.Scanner;

public class RafaelKrassota_2791 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirFeijao(int posicaoFeijao) {
        System.out.printf("%d\n", posicaoFeijao);
    }

    public static int descobrirFeijao(int[] copos) {
        int posicaoFeijao = 0;
        if(copos[0] == 1) {
            posicaoFeijao = 1;
        }else if(copos[1] == 1) {
            posicaoFeijao = 2;
        }else if(copos[2] == 1) {
            posicaoFeijao = 3;
        }else if(copos[3] == 1) {
            posicaoFeijao = 4;
        }
        return posicaoFeijao;
    }

    public static void main(String[] args) {
        int posicaoFeijao = 0;
        int[] copos = new int[4];

        copos[0] = lerInteiro();
        copos[1] = lerInteiro();
        copos[2] = lerInteiro();
        copos[3] = lerInteiro();

        posicaoFeijao = descobrirFeijao(copos);
        
        imprimirFeijao(posicaoFeijao);
    }
}