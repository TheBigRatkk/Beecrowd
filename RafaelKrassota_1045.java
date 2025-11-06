import java.util.Scanner;
import java.util.Arrays;

public class RafaelKrassota_1045 {
    
    final static Scanner TECLADO = new Scanner(System.in);

    public static double lerDouble() {
        double valor = 0;
        valor = TECLADO.nextDouble();
        return valor;
    }

    public static void imprimirResposta(String classLados, String classAngulos, double[] lados) {
        if(lados[2] >=lados[1] + lados[0]) {
            System.out.printf("NAO FORMA TRIANGULO\n");
        }else if(classLados == null) {
            System.out.printf("%s\n", classAngulos);
        }else {
            System.out.printf("%s\n%s\n", classAngulos, classLados);
        }
    }

    public static String classificarAngulo(double[] lados) {
        String classificacao = null;
        if(Math.pow(lados[2], 2) == Math.pow(lados[1], 2) + Math.pow(lados[0], 2)) {
            classificacao = "TRIANGULO RETANGULO";
        }else if(Math.pow(lados[2], 2) > Math.pow(lados[1], 2) + Math.pow(lados[0], 2)) {
            classificacao = "TRIANGULO OBTUSANGULO";
        }else if(Math.pow(lados[2], 2) < Math.pow(lados[1], 2) + Math.pow(lados[0], 2)) {
            classificacao = "TRIANGULO ACUTANGULO";
        }
        return classificacao;
    }

    public static String classificarLado(double[] lados) {
        String classificacao = null;
        if(lados[2] == lados[1] && lados[2] == lados[0]) {
            classificacao = "TRIANGULO EQUILATERO";
        }else if(lados[2] != lados[1] && lados[2] != lados[0] && lados[1] != lados[0]) {
            classificacao = null;
        }else {
            classificacao = "TRIANGULO ISOSCELES";
        }
        return classificacao;
    }

    public static void main(String[] args) {
        double A = 0;
        double B = 0;
        double C = 0;
        String classLados = null;
        String classAngulos = null;

        A = lerDouble();
        B = lerDouble();
        C = lerDouble();
        double[] lados = {A, B, C};
        Arrays.sort(lados);

        classAngulos = classificarAngulo(lados);
        classLados = classificarLado(lados);

        imprimirResposta(classLados, classAngulos, lados);
    }
}