import java.util.Scanner;

public class RafaelKrassota_1009 {
    
    final static Scanner TECLADO = new Scanner(System.in);

    public static float lerFloat() {
        float valor = 0;
        valor = TECLADO.nextFloat();
        return valor;
    }

    public static String lerTexto() {
        String texto = null;
        texto = TECLADO.nextLine();
        return texto;
    }

    public static void imprimirTotal(float salarioTotal) {
        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);
    }

    public static float obterTotal(float salarioFixo, float totalVendas) {
        float salarioTotal = 0;
        float comissaoGanha = 0;
        
        comissaoGanha = (totalVendas / 100) * 15;
        salarioTotal = salarioFixo + comissaoGanha;

        return salarioTotal;
    }

    public static void main(String[] args) {
        float salarioFixo = 0;
        float salarioTotal = 0;
        float totalVendas = 0;
        String nome = null;

        nome = lerTexto();
        salarioFixo = lerFloat();
        totalVendas = lerFloat();

        salarioTotal = obterTotal(salarioFixo, totalVendas);

        imprimirTotal(salarioTotal);
    }
}