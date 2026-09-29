import java.util.Scanner;

public class RafaelKrassota_1018 {
    
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] qtdNotas = new int[7];
        int[] valoresNotas = {100, 50, 20, 10, 5, 2, 1};
        int valor = LER.nextInt();

        System.out.println(valor);

        for (int i = 0; i < qtdNotas.length; i++) {
            qtdNotas[i] = valor / valoresNotas[i];
            System.out.printf("%d nota(s) de R$ %d,00\n", qtdNotas[i], valoresNotas[i]);
            valor -= qtdNotas[i] * valoresNotas[i];
        }


    }
}