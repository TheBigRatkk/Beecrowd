import java.util.Scanner;

public class RafaelKrassota_2780 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirPontuacao(int pontuacao) {
        System.out.printf("%d\n", pontuacao);
    }

    public static int obterPontuacao(int distancia) {
        int pontuacao = 0;
        if(distancia <= 800) {
            pontuacao = 1;
        }else if(distancia <= 1400) {
            pontuacao = 2;
        }else {
            pontuacao = 3;
        }
        return pontuacao;
    }

    public static void main(String[] args) {
        int distancia = 0;
        int pontuacao = 0;

        distancia = lerInteiro();

        pontuacao = obterPontuacao(distancia);

        imprimirPontuacao(pontuacao);
    }
}
