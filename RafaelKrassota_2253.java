import java.util.Scanner;

public class RafaelKrassota_2253 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        String senha;
        String padrao = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,32}$";

        while (LER.hasNext()) {
            senha = LER.next();

            if (senha.matches(padrao)) {
                System.out.println("Senha valida.");
            }else {
                System.out.println("Senha invalida.");
            }
        }
    }
}
