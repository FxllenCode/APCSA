public class Lab1B {
    public static void main(String[] args) {

        System.out.println("+------+");

        for(int i = 0; i < 6; i++) {
            System.out.print("|");

            for(int j = 2; j > i % 3; j--) {
                System.out.print(" ");
            }
            System.out.print("^");

            for(int j = 0; j < i % 3; j++) {
                System.out.print("  ");
            }
            System.out.print("^");
            
            for(int j = 2; j > i % 3; j--) {
                System.out.print(" ");
            }
            
            System.out.println("|");
            }

            System.out.println("+------+");

        for(int i = 0; i < 6; i++) {
            System.out.print("|");

            for(int j = 0; j < i % 3; j++) {
                System.out.print(" ");
            }
            System.out.print("V");

            for(int j = 2; j > i % 3; j--) {
                System.out.print("  ");
            }
            System.out.print("V");
            
            for(int j = 0; j < i % 3; j++) {
                System.out.print(" ");
            }
            
            System.out.println("|");
        }

        System.out.println("+------+");


    }

    

}

