import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

    @Test
    public void testCalculateWithValidInput() {
        double result = Task1.calculate(1, 2);
        double expected = 1.3922749448749296;
        double epsilon = 1e-6;
        assertEquals(expected, result, epsilon);
    }

    @Test
    public void testCalculateWithZeroY() {
        double result = Task1.calculate(1, 0);
        double expected = 1.5693578060911904;
        double epsilon = 1e-6;
        assertEquals(expected, result, epsilon);
    }

    @Test
    public void testCalculateWithZeroX() {
        double result = Task1.calculate(0, 2);
        double expected = 0.913410905215903;
        double epsilon = 1e-6;
        assertEquals(expected, result, epsilon);
    }
}
