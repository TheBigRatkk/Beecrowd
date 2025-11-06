import java.util.Scanner;

public class RafaelKrassota_1046 {
    
    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirDuracao(int duracaoJogo) {
        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracaoJogo);
    }

    public static int obterDuracao(int hora1, int hora2) {
        int duracaoJogo = 0;
        if(hora1 < hora2) {
            duracaoJogo = hora2 - hora1;
        }else if(hora1 > hora2) {
            duracaoJogo = (hora2 + 24) - hora1;
        }else if(hora1 == hora2) {
            duracaoJogo = 24;
        }
        return duracaoJogo;
    }

    public static void main(String[] args) {
        int hora1 = 0;
        int hora2 = 0;
        int duracaoJogo = 0;

        hora1 = lerInteiro();
        hora2 = lerInteiro();
        
        duracaoJogo = obterDuracao(hora1, hora2);

        imprimirDuracao(duracaoJogo);
    }
}