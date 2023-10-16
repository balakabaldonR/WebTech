import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int authorComparison = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorComparison != 0) {
            return authorComparison;
        } else {
            return book1.getTitle().compareTo(book2.getTitle());
        }
    }
}