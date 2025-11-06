import java.util.Scanner;

public class RafaelKrassota_1310 {

    public final static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        int valor = 0;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int maxDias = 0;
        int custoDia = 0;
        int receitaDia = 0;
        int lucroDia = 0;
        int lucroMax = 0;
        int lucroParcial = 0;

        while(TECLADO.hasNext()) {
            lucroMax = 0;
            lucroParcial = 0;

            maxDias = lerInt();
            custoDia = lerInt();

            for(int i = 0; i < maxDias; i++) {
                receitaDia = lerInt();
                lucroDia = receitaDia - custoDia;
                lucroParcial += lucroDia;

                if(lucroParcial < 0) {
                    lucroParcial = 0;
                }if(lucroParcial > lucroMax) {
                    lucroMax = lucroParcial;
                }
            }
            
        }
    }
}