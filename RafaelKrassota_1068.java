import java.util.Scanner;
import java.util.Stack;

public class RafaelKrassota_1068 {

    final static Scanner LER = new Scanner(System.in);

    public static boolean verifica(String bagui) {
        char[] trem = bagui.toCharArray();
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < trem.length; i++) {
            if (trem[i] == '(') {
                pilha.push(trem[i]);
            } else if (trem[i] == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }

        if (pilha.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String expressao;
        boolean sim = true;

        while (LER.hasNext()) {
            expressao = LER.nextLine();

            sim = verifica(expressao);

            if (sim) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
    }
}
