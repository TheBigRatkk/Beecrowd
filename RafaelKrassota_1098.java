public class RafaelKrassota_1098 {
    public static void main(String[] args) {
        double I = 0;
        double J = 0;

        for(int i = 0; i<11; i++) {
            for(int j = 1; j < 4; j++) {
                J = j;
                J += I;
                System.out.printf("I=%.1f J=%.1f\n", I, J);
            }
            I += 0.2;
        }
    }
}
