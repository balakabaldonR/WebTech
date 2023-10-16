public class Task4 {
    public static void main(String[] args) {
        int[] sourceArray = new int[]{1, 2, 3, 4};
        System.out.println(printIndexOfPrimeNumbers(sourceArray));
    }

    public static String printIndexOfPrimeNumbers(int[] mas) {
        boolean hasPrimeNumbers = false;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < mas.length; i++)
            if (isPrime(mas[i])) {
                hasPrimeNumbers = true;
                result.append(mas[i]).append("\n");
            }
        if (!hasPrimeNumbers)
            result.append("No prime numbers");
        return result.toString();
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n) + 1; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}
