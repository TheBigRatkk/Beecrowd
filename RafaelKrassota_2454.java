import java.util.Scanner;

public class RafaelKrassota_2454 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirCaminho(char caminho) {
        System.out.printf("%C\n", caminho);
    }

    public static char acharCaminho(int portaP, int portaR) {
        char caminho;
        if (portaP == 0) {
            caminho = 'C';
        }else if(portaR == 0) {
            caminho = 'B';
        }else {
            caminho = 'A';
        }
        return caminho;
    }

    public static void main(String[] args) {
        int portaP = 0;
        int portaR = 0;
        char caminho;

        portaP = lerInteiro();
        portaR = lerInteiro();

        caminho = acharCaminho(portaP, portaR);

        imprimirCaminho(caminho);
    }
}