import java.util.Scanner;

public class RafaelKrassota_1120 {

    final static Scanner LER = new Scanner(System.in);

    public static void substituir(String tal, String grandao) {
        if (grandao.contains(tal)) {
            grandao.replaceAll(tal, "");
        }
    }

    public static void main(String[] args) {
        String oTal;
        String numero;

        while (true) {

            oTal = LER.nextBigInteger().toString();
            numero = LER.nextBigInteger().toString();

            if (oTal.equals("0") && numero.equals("0")) {
                break;
            }

            substituir(oTal, numero);

            numero.replaceFirst("^0+", "");

            if (numero.isEmpty()) {
                System.out.println("0");
            }else {
                System.out.println(numero);
            }
        }
    }
}

/*

String resultado = oTal.replace(numero, "");

resultado = resultado.replaceFirst("^0+", "");

if(resultado.isEmpty()){
return "0";
}
return resultado;


*/
