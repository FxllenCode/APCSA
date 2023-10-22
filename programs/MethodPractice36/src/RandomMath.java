public class RandomMath {
    public static double subtract(double x, double y) { // x - y
        return x - y;
    }

    public static int twoXplus5(int x) { // 2x - 5
        return (2 * x) - 5;
    }

    public static double fiveXminus8(double x) { // 5x - 8
        return (5 * x) - 8;
    }

    public static double threeXplus2(double x) { // 3x + 2
        return (3 * x) + 2;
    }

    public static String smoothTogether(double x, double y, double z) {
        int iX = (int) x;
        int iY = (int) y;
        int iZ = (int) z;

        return "" + String.valueOf(iX) + String.valueOf(iY) + String.valueOf(iZ);
    }
}
