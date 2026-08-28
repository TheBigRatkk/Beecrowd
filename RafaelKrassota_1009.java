import java.util.Scanner;

public class RafaelKrassota_1009 {
    
    final static Scanner TECLADO = new Scanner(System.in);

    public static double lerdouble() {
        double valor = 0;
        valor = TECLADO.nextDouble();
        return valor;
    }

    public static String lerTexto() {
        String texto = null;
        texto = TECLADO.nextLine();
        return texto;
    }

    public static void imprimirTotal(double salarioTotal) {
        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);
    }

    public static double obterTotal(double salarioFixo, double totalVendas) {
        double salarioTotal = 0;
        double comissaoGanha = 0;
        
        comissaoGanha = (totalVendas / 100) * 15;
        salarioTotal = (salarioFixo + comissaoGanha);

        return salarioTotal;
    }

    public static void main(String[] args) {
        double salarioFixo = 0;
        double salarioTotal = 0;
        double totalVendas = 0;
        String nome = null;

        nome = lerTexto();
        salarioFixo = lerdouble();
        totalVendas = lerdouble();

        salarioTotal = obterTotal(salarioFixo, totalVendas);

        imprimirTotal(salarioTotal);
    }
}