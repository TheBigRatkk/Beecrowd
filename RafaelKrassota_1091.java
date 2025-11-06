import java.util.Scanner;

public class RafaelKrassota_1091 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void imprimirPosicao(String quadrante) {
       System.out.println(quadrante);
    }

    public static String obterPosicao(int pontoDivisaX, int pontoDivisaY, int pontoCasaX, int pontoCasaY) {
        String quadrante = null;
        if(pontoCasaX > pontoDivisaX && pontoCasaY > pontoDivisaY) {
            quadrante = "NE";
        }else if(pontoCasaX < pontoDivisaX && pontoCasaY > pontoDivisaY) {
            quadrante = "NO";
        }else if(pontoCasaX > pontoDivisaX && pontoCasaY < pontoDivisaY) {
            quadrante = "SE";
        }else if(pontoCasaX < pontoDivisaX && pontoCasaY < pontoDivisaY) {
            quadrante = "SO";
        }else {
            quadrante = "divisa";
        }
        return quadrante;
    }

    public static void main(String[] args) {
        int pontoDivisaX = 0;
        int pontoDivisaY = 0;
        int consultas = 0;
        int pontoCasaX = 0;
        int pontoCasaY = 0;
        String quadrante = null;

        while(true) {
            consultas = lerInt();
            if(consultas == 0) {
                break;
            }else {
               pontoDivisaX = lerInt();
               pontoDivisaY = lerInt();
            for(int i = 0; i < consultas; i++) {
                pontoCasaX = lerInt();
                pontoCasaY = lerInt();
                quadrante = obterPosicao(pontoDivisaX, pontoDivisaY, pontoCasaX, pontoCasaY);
                imprimirPosicao(quadrante); 
            }
          }
        }
    }
}