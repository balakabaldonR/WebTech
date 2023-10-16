import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Task4Test {

    @Test
    public void testIsPrimeWithPrimeNumbers() {
        assertTrue(Task4.isPrime(2));
        assertTrue(Task4.isPrime(3));
        assertTrue(Task4.isPrime(5));
        assertTrue(Task4.isPrime(7));
        assertTrue(Task4.isPrime(11));
        assertTrue(Task4.isPrime(13));
        assertTrue(Task4.isPrime(17));
        assertTrue(Task4.isPrime(19));
        assertTrue(Task4.isPrime(23));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumbers() {
        assertFalse(Task4.isPrime(0));
        assertFalse(Task4.isPrime(1));
        assertFalse(Task4.isPrime(4));
        assertFalse(Task4.isPrime(6));
        assertFalse(Task4.isPrime(8));
        assertFalse(Task4.isPrime(9));
        assertFalse(Task4.isPrime(15));
        assertFalse(Task4.isPrime(20));
        assertFalse(Task4.isPrime(25));
    }

    @Test
    public void testPrintIndexOfPrimeNumbersWithPrimeNumbers() {
        int[] sourceArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String actualOutput = Task4.printIndexOfPrimeNumbers(sourceArray);

        String expectedOutput = "2\n3\n5\n7\n";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPrintIndexOfPrimeNumbersWithNoPrimeNumbers() {
        int[] sourceArray = new int[]{4, 6, 8, 9, 10};

        String actualOutput = Task4.printIndexOfPrimeNumbers(sourceArray);

        String expectedOutput = "No prime numbers";
        assertEquals(expectedOutput, actualOutput);
    }
}