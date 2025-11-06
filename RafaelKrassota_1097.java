public class RafaelKrassota_1097 {
    public static void main(String[] args) {
        int J = 7;
        int Jconst = 7;
        int I = 1;

        for(int i = 1; i < 6; i++) {
            for(int j = 0; j < 3; j++){
                System.out.printf("I=%d J=%d\n", I, J);
                J -= 1;
            }
            I += 2;
            Jconst += 2;
            J = Jconst;
        }
    }
}