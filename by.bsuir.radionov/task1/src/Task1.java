
public class Task1 {
    public static void main(String[] args) {
        System.out.println(calculate(1, 2));
    }

    public static double calculate(double x, double y) {
        double numerator = 1 + Math.sin(x + y) * Math.sin(x + y);
        return numerator / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y))) + x;
    }
}
