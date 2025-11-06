import java.util.Scanner;

public class RafaelKrassota_1040 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static void imprimirAprovado(float media) {
        System.out.printf("Media: %.1f\nAluno aprovado.\n", media);
    }

    public static void imprimirReprovado(float media) {
        System.out.printf("Media: %.1f\nAluno reprovado.\n", media);
    }

    public static void imprimirExame(float media, float notaExame, float mediaExame) {
        System.out.printf("Media: %.1f\nAluno em exame.\n", media);
        notaExame = lerFloat();
        mediaExame = calcularExame(notaExame, media);

        if (mediaExame >= 5) {
            System.out.printf("Nota do exame: %.1f\nAluno aprovado.\nMedia final: %.1f\n", notaExame, mediaExame);
        } else {
            System.out.printf("Nota do exame: %.1f\nAluno reprovado.\nMedia final: %.1f\n", notaExame, mediaExame);
        }
    }

    public static float lerFloat() {
        float valor = 0;
        valor = TECLADO.nextFloat();
        return valor;
    }

    public static float calcularMedia(float N1, float N2, float N3, float N4) {
        float media = 0;
        float P1 = 2;
        float P2 = 3;
        float P3 = 4;
        float P4 = 1;
        media = ((N1 * P1) + (N2 * P2) + (N3 * P3) + (N4 * P4)) / (P1 + P2 + P3 + P4);
        return media;
    }

    public static float calcularExame(float notaExame, float media) {
        float mediaExame = 0;
        mediaExame = (media + notaExame) / 2;
        return mediaExame;
    }

    public static void main(String[] args) {
        float N1 = 0;
        float N2 = 0;
        float N3 = 0;
        float N4 = 0;
        float notaExame = 0;
        float media = 0;
        float mediaExame = 0;

        N1 = lerFloat();
        N2 = lerFloat();
        N3 = lerFloat();
        N4 = lerFloat();

        media = calcularMedia(N1, N2, N3, N4);

        if (media > 7) {
            imprimirAprovado(media);
        } else if (media < 5) {
            imprimirReprovado(media);
        } else if (media >= 5 && media <= 7) {
            imprimirExame(media, notaExame, mediaExame);
        }
    }
}