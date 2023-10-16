import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ComparatorsTest {
    @Test
    public void testTitleComparator() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("B", "A", 30, 1, "123"));
        books.add(new Book("C", "D", 20, 2, "456"));
        books.add(new Book("A", "E", 40, 3, "789"));

        Collections.sort(books, new TitleComparator());

        assertEquals("A", books.get(0).getTitle());
        assertEquals("B", books.get(1).getTitle());
        assertEquals("C", books.get(2).getTitle());
    }

    @Test
    public void testAuthorComparator() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("B", "A", 30, 1, "123"));
        books.add(new Book("C", "E", 20, 2, "456"));
        books.add(new Book("A", "D", 40, 3, "789"));

        Collections.sort(books, new AuthorComparator());

        assertEquals("B", books.get(0).getTitle());
        assertEquals("A", books.get(1).getTitle());
        assertEquals("C", books.get(2).getTitle());
    }

    @Test
    public void testAuthorTitlePriceComparator() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("B", "A", 30, 1, "123"));
        books.add(new Book("C", "D", 20, 2, "456"));
        books.add(new Book("A", "E", 40, 3, "789"));

        Collections.sort(books, new AuthorTitlePriceComparator());

        assertEquals("B", books.get(0).getTitle());
        assertEquals("C", books.get(1).getTitle());
        assertEquals("A", books.get(2).getTitle());
    }
}
