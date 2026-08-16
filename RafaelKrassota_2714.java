import java.util.Scanner;

public class RafaelKrassota_2714 {
    
    final static Scanner LER = new Scanner(System.in);

    public static String removeZero(String coiso) {
        int bagui = 0;

        for (int i = 0; i < coiso.length(); i++) {
            if (coiso.charAt(i) != '0') {
                bagui = i;
                break;
            }
        }

        coiso = new String(coiso.substring(bagui));

        

        return coiso;
    }

    public static void main(String[] args) {
        int n;
        String RA;

        n = LER.nextInt();
        for (int i = 0; i < n; i++) {
            RA = LER.next();

            if (RA.matches("^RA[0-9]{18}$")) {
                String ra = new String(RA.substring(2));
                
                ra = removeZero(ra);
                
                System.out.println(ra);
            }else {
                System.out.println("INVALID DATA");
            }         
        }
    }
}