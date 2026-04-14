package library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MemberTest {

    @Test
    void testBorrowBook() {
        Member member = new Member("Alice", "M1");
        Book book = new Book("Java", "1", "John", "Tech");

        assertTrue(member.borrowBook(book));
        assertFalse(book.isAvailable());
    }

    @Test
    void testReturnBook() {
        Member member = new Member("Alice", "M1");
        Book book = new Book("Java", "1", "John", "Tech");

        member.borrowBook(book);
        assertTrue(member.returnBook("1"));
        assertTrue(book.isAvailable());
    }
}