import java.util.Scanner;

public class RafaelKrassota_1008 {
    
    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static double lerDouble() {
        double valor = 0;
        valor = TECLADO.nextDouble();
        return valor;
    }

    public static void imprimirSalario(double salario, int num) {
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", num, salario);
    }

    public static double obterSalario(int horas, double valorHora) {
        double salario = 0;
        salario = horas * valorHora;
        return salario;
    }

    public static void main(String[] args) {
        int horas = 0;
        int numFunc = 0;
        double valorHora = 0;
        double salario = 0;

        numFunc =lerInteiro();
        horas =lerInteiro();
        valorHora = lerDouble();

        salario = obterSalario(horas, valorHora);

        imprimirSalario(salario, numFunc);
    }
}