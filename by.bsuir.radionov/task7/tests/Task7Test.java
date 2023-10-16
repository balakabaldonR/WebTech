import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task7Test {

    @Test
    public void testSortWithUnsortedArray() {
        double[] arr = {4, 3, 2, 1, 52, 21, 14, 3152, 163, 112, 511, 12, 444, 124, 1, 4, 124, 567};
        double[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        Task7.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testSortWithEmptyArray() {
        double[] arr = {};
        double[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        Task7.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testSortWithSingleElementArray() {
        double[] arr = {42};
        double[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        Task7.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testSortWithAlreadySortedArray() {
        double[] arr = {1, 2, 3, 4, 5};
        double[] sortedArr = Arrays.copyOf(arr, arr.length);
        Task7.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }
}
