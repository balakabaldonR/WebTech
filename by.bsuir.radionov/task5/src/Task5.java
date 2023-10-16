public class Task5 {
    public static void main(String[] args) {
        System.out.println(minRemovals(new int[]{13, 51, 93, 91, 42, 36, 96, 37, 27, 18}));
        System.out.println(minRemovals(new int[]{1, 2, 3, 4, 5, 6}));
    }

    public static int minRemovals(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0;
        }

        int currentMax = arr[0];
        int removals = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= currentMax) {
                removals++;
            } else {
                currentMax = arr[i];
            }
        }

        return removals;
    }
}
