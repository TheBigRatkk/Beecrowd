import java.util.Scanner;

public class RafaelKrassota_1010 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int codego, codego2, qtd, qtd2;
        double valor, valor2, qtdFinal;

        codego = LER.nextInt();
        qtd = LER.nextInt();
        valor = LER.nextDouble();

        codego2 = LER.nextInt();
        qtd2 = LER.nextInt();
        valor2 = LER.nextDouble();

        qtdFinal = (valor * qtd) + (valor2 * qtd2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", qtdFinal);
    }
}