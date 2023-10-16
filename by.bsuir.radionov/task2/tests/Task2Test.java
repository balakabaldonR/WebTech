import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task2Test {
    @Test
    public void testCheckWithPointInBottomOfFigure() {
        assertTrue(Task2.check(-3, -2));
        assertTrue(Task2.check(0, -3));
        assertFalse(Task2.check(7, -1));
    }

    @Test
    public void testCheckWithPointInTopOfFigure() {
        assertTrue(Task2.check(-4, 0));
        assertTrue(Task2.check(2, 3));
        assertFalse(Task2.check(5, 6));
    }

    @Test
    public void testCheckWithExtremePoints() {
        assertTrue(Task2.check(-6, -3));
        assertTrue(Task2.check(6, 0));
        assertTrue(Task2.check(6, -3));
        assertTrue(Task2.check(-6, 0));
        assertTrue(Task2.check(-4, 5));
        assertTrue(Task2.check(4, 5));
    }

    @Test
    public void testCheckWithNonIncomingPoints() {
        assertFalse(Task2.check(-10, -2));
        assertFalse(Task2.check(-3, -8));
        assertFalse(Task2.check(5, 2));
    }
}
