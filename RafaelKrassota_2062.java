import java.util.Scanner;

public class RafaelKrassota_2062 {
    
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int teste;
        StringBuilder texto = new StringBuilder();

        teste = LER.nextInt();

        for (int i = 0; i < teste; i++) {
            StringBuilder palavra = new StringBuilder(LER.next());
            
            if (palavra.length() == 3) {
                if (palavra.toString().startsWith("OB") || palavra.toString().startsWith("UR")) {
                    palavra.setCharAt(2, 'I');  
                }
            }

            texto.append(" " + palavra);
        }

        texto.deleteCharAt(0);

        System.out.println(texto);
    }
}
