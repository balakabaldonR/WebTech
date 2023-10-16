import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Task8Test {

    @Test
    public void testFindInsertionIndices_WhenBIsInsertedInMiddleOfA() {
        double[] A = {1.0, 3.0, 5.0, 7.0};
        double[] B = {2.0, 4.0, 6.0};
        List<Integer> indices = Task8.findInsertionIndices(A, B);
        assertEquals(3, indices.size());
        assertEquals(1, indices.get(0));
        assertEquals(2, indices.get(1));
        assertEquals(3, indices.get(2));
    }

    @Test
    public void testFindInsertionIndices_WhenBIsInsertedAtTheEndOfA() {
        double[] A = {1.0, 2.0, 3.0};
        double[] B = {4.0, 5.0, 6.0};
        List<Integer> indices = Task8.findInsertionIndices(A, B);
        assertEquals(3, indices.size());
        assertEquals(3, indices.get(0));
        assertEquals(3, indices.get(1));
        assertEquals(3, indices.get(2));
    }

    @Test
    public void testFindInsertionIndices_WhenBIsNotInsertedInA() {
        double[] A = {7.0, 8.0, 9.0};
        double[] B = {4.0, 5.0, 6.0};
        List<Integer> indices = Task8.findInsertionIndices(A, B);
        assertEquals(3, indices.size());
        assertEquals(0, indices.get(0));
        assertEquals(0, indices.get(1));
        assertEquals(0, indices.get(2));
    }

    @Test
    public void testFindInsertionIndices_WhenAIsEmpty() {
        double[] A = {};
        double[] B = {2.0, 4.0, 6.0};
        List<Integer> indices = Task8.findInsertionIndices(A, B);
        assertEquals(3, indices.size());
        assertEquals(0, indices.get(0));
        assertEquals(0, indices.get(1));
        assertEquals(0, indices.get(2));
    }

    @Test
    public void testFindInsertionIndices_WhenBIsEmpty() {
        double[] A = {1.0, 3.0, 5.0, 7.0};
        double[] B = {};
        List<Integer> indices = Task8.findInsertionIndices(A, B);
        assertEquals(0, indices.size());
    }
}
