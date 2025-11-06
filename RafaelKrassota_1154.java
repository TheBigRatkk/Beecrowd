import java.util.Scanner;

public class RafaelKrassota_1154 {
    
    public final static Scanner TECLADO = new Scanner(System.in);

    public static double lerReal() {
        double valor = 0;
        valor = TECLADO.nextDouble();
        return valor;
    }

    public static void main(String[] args) {
        double somaIdades = 0;
        int qtdPessoas = 1;
        double valorAtual = 0;
        double media = 0;

        while(true) {
            valorAtual = lerReal();
            if(valorAtual < 0) {
                break;
            }else {
                somaIdades += valorAtual;
                qtdPessoas++;
            }
        }

        media = somaIdades/valorAtual;
        System.out.printf("%f.2", media);
    }
}