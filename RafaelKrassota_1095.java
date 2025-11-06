public class RafaelKrassota_1095 {
    public static void main(String[] args) {
        int i = 1;
        int j = 60;

        while(true) {
            if(j < 0) {
                break;
            }else {
                System.out.printf("I=%d J=%d\n", i, j);
                i += 3;
                j -= 5;
            }
        }
    }
}
