public class App {
    public static void main(String[] args) throws Exception {
        int x = 26848;
        System.out.println(x%100);

        int y1 = 350;
        int y2 = 107;

        int yFinal = y1 + y2;

        while(yFinal > 9) {
            yFinal /= 10;
        }

        System.out.println(yFinal);

        int z = 756111;

        while(z > 9) {
            z /= 10;
        }

        z *= 3;

        System.out.println(z);
    }
}
