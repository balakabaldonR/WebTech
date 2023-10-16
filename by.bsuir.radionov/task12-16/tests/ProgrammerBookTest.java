import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ProgrammerBookTest {
    @Test
    public void testEquals() {
        ProgrammerBook book1 = new ProgrammerBook("Java Programming","John Doe","Java",2);

        ProgrammerBook book2 = new ProgrammerBook("Python Programming","Jane Smith","Java",2);

        ProgrammerBook book3 = new ProgrammerBook("Java Programming","John Doe","Java",2);

        Assert.assertTrue(book1.equals(book3));
        Assert.assertFalse(book1.equals(book2));
    }

    @Test
    public void testHashCode() {
        ProgrammerBook book1 = new ProgrammerBook("Java Programming","John Doe","Java",2);

        ProgrammerBook book2 = new ProgrammerBook("Java Programming","John Doe","Java",2);

        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    public void testToString() {
        ProgrammerBook book = new ProgrammerBook("Java Programming","John Doe","Java",2);

        String expected = "ProgrammerBook{Title:Java Programming Author:John Doe Price:0 Edition:0 language='Java' level=2}";
        assertEquals(expected, book.toString());
    }
}
