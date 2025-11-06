import java.util.Scanner;

public class RafaelKrassota_1041 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static void imprimirQuadrante(String quadrante) {
        System.out.println(quadrante);
    }

    public static double lerDouble() {
        double valor = 0;
        valor = TECLADO.nextDouble();
        return valor;
    }

    public static String acharQuadrante(double x, double y) {
        String quadrante = "";
        if(x == 0 && y == 0) {
            quadrante = "Origem";
        }else if(x == 0 && y != 0) {
            quadrante = "Eixo Y";
        }else if(y == 0 && x != 0) {
            quadrante = "Eixo X" ;  
        }else if(x > 0 && y > 0) {
            quadrante = "Q1";
        }else if(x < 0 && y > 0) {
            quadrante = "Q2";
        }else if(x < 0 && y < 0) {
            quadrante = "Q3";
        }else {
            quadrante = "Q4";
        }
        return quadrante;
    }

    public static void main(String[] args) {
        String quadrante = "";
        double x = 0;
        double y = 0;

        x = lerDouble();
        y = lerDouble();

        quadrante = acharQuadrante(x, y);

        imprimirQuadrante(quadrante);
    }
}