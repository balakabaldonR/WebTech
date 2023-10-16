import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test {

    @Test
    public void testPrintMatrixWithValidInput() {
        double[] arr = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        String actualOutput = Task6.printMatrix(arr);

        String expectedOutput = "1,00 2,00 3,00 4,00 5,00 6,00 7,00 8,00 9,00 \n" +
                "2,00 3,00 4,00 5,00 6,00 7,00 8,00 9,00 1,00 \n" +
                "3,00 4,00 5,00 6,00 7,00 8,00 9,00 1,00 2,00 \n" +
                "4,00 5,00 6,00 7,00 8,00 9,00 1,00 2,00 3,00 \n" +
                "5,00 6,00 7,00 8,00 9,00 1,00 2,00 3,00 4,00 \n" +
                "6,00 7,00 8,00 9,00 1,00 2,00 3,00 4,00 5,00 \n" +
                "7,00 8,00 9,00 1,00 2,00 3,00 4,00 5,00 6,00 \n" +
                "8,00 9,00 1,00 2,00 3,00 4,00 5,00 6,00 7,00 \n" +
                "9,00 1,00 2,00 3,00 4,00 5,00 6,00 7,00 8,00 \n";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPrintMatrixWithEmptyArray() {
        double[] arr = new double[]{};

        String actualOutput = Task6.printMatrix(arr);

        String expectedOutput = "";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPrintMatrixWithSingleElement() {
        double[] arr = new double[]{42};

        String actualOutput = Task6.printMatrix(arr);

        String expectedOutput = "42,00 \n";
        assertEquals(expectedOutput, actualOutput);
    }
}
