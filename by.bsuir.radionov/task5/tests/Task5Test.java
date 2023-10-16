import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test {

    @Test
    public void testFindLeastNumberOfElementsWithUnsortedArray() {
        int[] arr = new int[]{13, 51, 93, 91, 42, 36, 96, 37, 27, 18};
        int result = Task5.minRemovals(arr);
        int expected = 6;
        assertEquals(expected, result);
    }

    @Test
    public void testFindLeastNumberOfElementsWithSortedArray() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int result = Task5.minRemovals(arr);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void testFindLeastNumberOfElementsWithEmptyArray() {
        int[] arr = new int[]{};
        int result = Task5.minRemovals(arr);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void testFindLeastNumberOfElementsWithSingleElement() {
        int[] arr = new int[]{42};
        int result = Task5.minRemovals(arr);
        int expected = 0;
        assertEquals(expected, result);
    }
}