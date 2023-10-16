public class Task2 {
    public static void main(String[] args) {
        System.out.println(check(0, 0));
    }

    public static boolean check(int x, int y) {
        return checkingUnderTheFigure(x, y) || checkingOverTheFigure(x, y);
    }

    public static boolean checkingUnderTheFigure(int x, int y) {
        return (x >= -6 && x <= 6) && (y >= -3 && y <= 0);
    }

    public static boolean checkingOverTheFigure(int x, int y) {
        return (x >= -4 && x <= 4) && (y >= 0 && y <= 5);
    }

}
