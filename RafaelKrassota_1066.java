import java.util.Scanner;

public class RafaelKrassota_1066 {
    
    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirNums(int numImpar, int numNeg, int numPares, int numPos) {
        System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n", numPares, numImpar, numPos, numNeg);
    }

    public static void main(String[] args) {
        int num = 0;
        int numPos = 0;
        int numNeg = 0;
        int numImpar = 0;
        int numPares = 0;

        for(int i = 0; i < 5; i++) {
            num = lerInteiro();
            if(num < 0) {
                numNeg++;
            }else if(num > 0) {
                numPos++;
            }if(num % 2 == 0) {
                numPares++;
            }else {
                numImpar++;
            }
        }
        
        imprimirNums(numImpar, numNeg, numPares, numPos);
    }
}