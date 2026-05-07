import java.util.Scanner;

public class RafaelKrassota_1168 {

    final static Scanner LER = new Scanner(System.in);

    public static int contaLED(char[] num) {
        int contLED = 0;
        for (int i = 0; i < num.length; i++) {
            switch (num[i]) {
                case '1':
                    contLED+=2;
                    break;

                case '2':
                case '5':
                case '3':
                    contLED+=5;
                    break;

                case '6':
                case '9':
                case '0':
                    contLED+=6;
                    break;

                case '4':
                    contLED+=4;
                    break;
            
                case '7':
                    contLED+=3;
                    break;

                case '8':
                    contLED+=7;
                    break;
            
                default:
                    break;
            }
        }
        return contLED;
    }

    public static void main(String[] args) {
        String numero;
        char[] numeroS;
        int totalLeds;
        int casosTeste = LER.nextInt();

        for (int i = 0; i < casosTeste; i++) {
            totalLeds = 0;
            numero = LER.next();
            numeroS = numero.toCharArray();
            totalLeds = contaLED(numeroS);

            System.out.printf("%d leds\n", totalLeds);
        }
    }
}