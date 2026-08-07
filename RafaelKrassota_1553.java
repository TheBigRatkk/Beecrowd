import java.util.HashMap;
import java.util.Scanner;

public class RafaelKrassota_1553 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {      

        while (true) {
            HashMap<Integer, Integer> contagem = new HashMap<>();
            int perguntas = 0;
            int freqMin = 0;
            int nPergunta = 0;
            int frequntes = 0;

            perguntas = LER.nextInt();
            freqMin = LER.nextInt();

            if (perguntas == 0 && freqMin == 0) {
                break;
            }

            for (int i = 0; i < perguntas; i++) {
                nPergunta = LER.nextInt();

                contagem.put(nPergunta, contagem.getOrDefault(nPergunta, 0) + 1);
            }

            for (int quantia : contagem.values()) {
                if (quantia >= freqMin) {
                    frequntes++;
                }
            }
            
            System.out.println(frequntes);
        }
    }
}