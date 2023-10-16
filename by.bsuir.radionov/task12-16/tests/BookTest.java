import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BookTest {

    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    public void setUp() {
        book1 = new Book("Book Title 1", "Author 1", 20, 1);
        book2 = new Book("Book Title 2", "Author 2", 30, 2);
        book3 = new Book("Book Title 2", "Author 2", 30, 2);
    }

    @Test
    public void testEqualsAndHashCode() {
        assertEquals(book1, book1);
        assertNotEquals(book1, book2);
    }

    @Test
    public void testToString() {
        String expectedString = "Title:Book Title 1 Author:Author 1 Price:20 Edition:1";
        assertEquals(expectedString, book1.toString());
    }

    @Test
    public void testClone() {
        Book originalBook = new Book("Sample Title", "Sample Author", 20, 1);

        Book clonedBook = (Book) originalBook.clone();

        Assert.assertNotSame(originalBook, clonedBook);

        assertEquals(originalBook.getTitle(), clonedBook.getTitle());
        assertEquals(originalBook.getAuthor(), clonedBook.getAuthor());
        assertEquals(originalBook.getPrice(), clonedBook.getPrice());
        assertEquals(originalBook.getEdition(), clonedBook.getEdition());
    }


    @Test
    public void testCompareTo() {
        book1.setIsbn("1");
        book2.setIsbn("2");
        book3.setIsbn("3");

        List<Book> books = new ArrayList<>();
        books.add(book3);
        books.add(book1);
        books.add(book2);

        Collections.sort(books);

        assertEquals(book1, books.get(0));
        assertEquals(book2, books.get(1));
        assertEquals(book3, books.get(2));
    }
}
