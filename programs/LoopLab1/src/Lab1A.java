public class Lab1A {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < (i - 6) * -1; j++) { // Multiplying by -1 to subsitute for using Math.abs(). 
                System.out.print("*");
            }
            for (int j = 0; j < i + 1; j++ ) { // There is a + 1 to include for the space that exists at iteration 0
                System.out.print(" ");
            }
            for (int j = 0; j < (i - 6) * -2; j++) { // It goes 2 at a time, so I am using -2, also because of doing this instead of doing Math.abs().
                System.out.print("/");
            }
            for (int j = 0; j < (i * 2); j++ ) { // This one does not go in reverse order so no Math.abs() needed, just straight multipying it by 2.
                System.out.print("\\");
            }
            for (int j = 0; j < i + 1; j++ ) { // Again, + 1 to indicate there is an extra space at iteration 0. 
                System.out.print(" ");
            }
            for (int j = 0; j < (i - 6) * -1; j++) {  
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
