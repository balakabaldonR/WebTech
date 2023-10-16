import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(findInsertionIndices(new double[]{1.0, 3.0, 5.0, 7.0}, new double[]{2.0, 4.0, 6.0}));
    }

    public static List<Integer> findInsertionIndices(double[] A, double[] B) {
        List<Integer> insertionIndices = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                i++;
            } else {
                insertionIndices.add(i);
                j++;
            }
        }

        while (j < B.length) {
            insertionIndices.add(i);
            j++;
        }

        return insertionIndices;
    }
}
