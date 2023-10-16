import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {

    @Test
    public void testFunctionWithZero() {
        double result = Task3.function(0);
        double expected = 0.0;
        double epsilon = 1e-6;
        assertEquals(expected, result, epsilon);
    }

    @Test
    public void testFunctionWithPositiveValue() {
        double result = Task3.function(1.0);
        double expected = Math.tan(1.0);
        double epsilon = 1e-6;
        assertEquals(expected, result, epsilon);
    }

    @Test
    public void testFunctionWithNegativeValue() {
        double result = Task3.function(-1.0);
        double expected = Math.tan(-1.0);
        double epsilon = 1e-6;
        assertEquals(expected, result, epsilon);
    }

}
