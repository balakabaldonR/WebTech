public class Task3 {

    public static void main(String[] args) {
        double h = 0.2;
        double a = -1;
        double b = 1;
        for (double x = a; x <= b; x += h) {
            System.out.format("| %.4f | %.4f |\n", x, function(x));
        }
    }

    static double function(double x) {
        return Math.tan(x);
    }
}
