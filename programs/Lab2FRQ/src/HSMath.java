public class HSMath {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
    }

    private static double discrim(double A, double B, double C) {
        return Math.pow(B, 2) - (4*A*C);
    }

    public static double round2(double n) {
        return Math.round(n * 100.00) / 100.00;
    }

    public static void quadratic(double A, double B, double C) {
        double discrim = discrim(A, B, C);
        if (discrim < 0) {
            System.out.println("Two complex roots: (" + round2((-B / (2 * A))) + " + " + round2(Math.sqrt(Math.abs(discrim)) / (2 * A)) + "i" + "), (" + round2((-B / (2 * A))) + " - " + round2(Math.sqrt(Math.abs(discrim)) / (2 * A)) + "i" + ")") ;
        } else if (discrim == 0) {
            System.out.println("One real root: " + round2((-B / (2 * A))));
        } else {
            System.out.println("Two real roots: "  + round2((-B + Math.sqrt(discrim)) / (2 * A)) + ", " + round2((-B - Math.sqrt(discrim)) / (2 * A)));
        }
    }
}
