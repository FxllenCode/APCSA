public class App {
    public static void main(String[] args) throws Exception {
        int height = 500000000;
        for (int i = 1; i <= height; i++){
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){ 
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
