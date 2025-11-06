import java.util.Scanner;

public class RafaelKrassota_1072{

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirIntervalo(int valoresNoIntervalo, int valoresFora) {
        System.out.printf("%d in\n%d out\n", valoresNoIntervalo, valoresFora);
    }

    public static int obterValoresIntervalo(int N) {
        int valoresNoIntervalo = 0;
        int X = 0;
        for(int i = 0; i < N; i++) {
            X = lerInt();
            if(X >= 10 && X <= 20) {
                valoresNoIntervalo++;
            }
        }
        return valoresNoIntervalo;
    }

    public static void main(String[] args) {
        int valoresNoIntervalo = 0;
        int valoresFora = 0;
        int N = 0;

        N = lerInt();

        valoresNoIntervalo = obterValoresIntervalo(N);
        valoresFora = N - valoresNoIntervalo;

        imprimirIntervalo(valoresNoIntervalo, valoresFora);
    }
}