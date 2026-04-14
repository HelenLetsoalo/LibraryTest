package library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    void testAddAndSearchBook() {
        Library library = new Library();
        Book book = new Book("Java Basics", "1", "John", "Tech");

        library.addBook(book);

        assertEquals(1, library.searchBook("Java Basics").size());
    }

    @Test
    void testRemoveBook() {
        Library library = new Library();
        Book book = new Book("Java Basics", "1", "John", "Tech");

        library.addBook(book);
        assertTrue(library.removeBook("1"));
        assertEquals(0, library.searchBook("Java Basics").size());
    }
}