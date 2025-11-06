import java.util.Scanner;

public class RafaelKrassota_1048 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static float lerFloat() {
        float valor = 0;
        valor = TECLADO.nextFloat();
        return valor;
    }

    public static void imprimirSalario(float salarioNovo, float reajuste, int percentualAjuste) {
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", salarioNovo,reajuste,percentualAjuste);
    }

    public static int obterPercentual(float salarioAtual) {
        int percentualAjuste = 0;
        if (salarioAtual >= 0 && salarioAtual <= 400) {
            percentualAjuste = 15;
        } else if (salarioAtual <= 800) {
            percentualAjuste = 12;
        } else if (salarioAtual <= 1200) {
            percentualAjuste = 10;
        } else if (salarioAtual <= 2000) {
            percentualAjuste = 7;
        } else {
            percentualAjuste = 4;
        }

        return percentualAjuste;
    }

    public static float obterReajuste(int percentualAjuste, float salarioAtual) {
        float reajuste = 0;
        reajuste = (salarioAtual / 100) * percentualAjuste;
        return reajuste;
    }

    public static float obterSalarioNovo(float salarioAtual, float reajuste) {
        float salarioNovo = 0;
        salarioNovo = salarioAtual + reajuste;
        return salarioNovo;
    }

    public static void main(String[] args) {
        float salarioAtual = 0;
        float salarioNovo = 0;
        float reajuste = 0;
        int percentualAjuste = 0;

        salarioAtual = lerFloat();

        percentualAjuste = obterPercentual(salarioAtual);
        reajuste = obterReajuste(percentualAjuste, salarioAtual);
        salarioNovo = obterSalarioNovo(salarioAtual, reajuste);

        imprimirSalario(salarioNovo, reajuste, percentualAjuste);
    }
}