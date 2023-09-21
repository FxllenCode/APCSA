import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner pranay = new Scanner(System.in);

        System.out.print("What'd you get on the calc quiz? ");

        int lieAboutGrade = pranay.nextInt();
        System.out.println("Oh, you got a " + lieAboutGrade + " on the quiz. ");
        pranay.nextLine();

        System.out.println("What is your favorite color of choclate? ");
        String chocoColor = pranay.nextLine();
        System.out.println("The greatest color of choclate is " + chocoColor);
        pranay.close();
    }
}
