import java.util.Scanner;

public class MathDriver {
    public static void main(String[] args) {
        System.out.println("Welcome to the HSMath calculator!");
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.print("Do you want to solve a quadratic forumla or a distance formula? (q/d) ");
            String response = myScanner.nextLine().toLowerCase();
            if (response.equals("q")) {
                double a;
                double b;
                double c;
                System.out.print("What is the value for A? ");
                a = myScanner.nextDouble();
                myScanner.nextLine();
                System.out.print("What is the value for B? ");
                b = myScanner.nextDouble();
                myScanner.nextLine();
                System.out.print("What is the value for C? ");
                c = myScanner.nextDouble();
                myScanner.nextLine();

                HSMath.quadratic(a, b, c);
                continue;
                
            } else if (response.equals("d")) {
                double x1;
                double y1;
                double x2; 
                double y2;

                System.out.print("What is the value for X1? ");
                x1 = myScanner.nextDouble();
                myScanner.nextLine();
                System.out.print("What is the value for Y1? ");
                y1 = myScanner.nextDouble();
                myScanner.nextLine();
                System.out.print("What is the value for X2? ");
                x2 = myScanner.nextDouble();
                myScanner.nextLine();
                System.out.print("What is the value for Y2? ");
                y2 = myScanner.nextDouble();
                myScanner.nextLine();

                System.out.println(HSMath.distance(x1, y1, x2, y2));
                continue;
            } 
            else {
                System.out.print("That was an invald value! Do you want to quit? (y/n) ");
                if (myScanner.nextLine().toLowerCase().equals("y")) {
                    System.out.println("Goodbye!");
                    break;
                }
                continue;
            }
        }
        
    }
}
