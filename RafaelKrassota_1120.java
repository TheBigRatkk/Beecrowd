import java.util.Scanner;

public class RafaelKrassota_1120 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        String oTal;
        String numero;

        while (true) {
            oTal = LER.next();
            numero = LER.next();

            if (oTal.equals("0") && numero.equals("0")) {
                break;
            }

            String resultado = numero.replace(oTal, "");
            resultado = resultado.replaceFirst("^0+", "");

            if (resultado.isEmpty()) {
                System.out.println("0");
            } else {
                System.out.println(resultado);
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
