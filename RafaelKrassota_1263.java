import java.util.Scanner;

class RafaelKrassota_1263 {

    final static Scanner LER = new Scanner(System.in);

    public static int contarAliteracoes(String texto) {
        int qtdAliteracoes = 0;
        int vezesAliteradas = 0;
        char letrAlitera = texto.charAt(0);
        
        for (int i = 1; i < texto.length(); i++) {
            char letraAtual = texto.charAt(i);

            if (Character.isSpaceChar(texto.charAt(i - 1))) {
                if (letraAtual == letrAlitera) {
                    vezesAliteradas++;
                }else {
                    letrAlitera = letraAtual;
                    if (vezesAliteradas >= 2) {
                        vezesAliteradas = 0;
                        qtdAliteracoes++;
                    }
                }
            }

        }

        return qtdAliteracoes;
    }

    public static void main(String[] args) {
        String texto;
        int aliteracoes;

        while (LER.hasNext()) {
            texto = LER.nextLine();
            aliteracoes = contarAliteracoes(texto);
            System.out.println(aliteracoes);
        }
    }
}