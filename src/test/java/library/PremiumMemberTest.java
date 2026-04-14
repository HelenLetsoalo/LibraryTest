package library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PremiumMemberTest {

    @Test
    void testBorrowLimit() {
        PremiumMember member = new PremiumMember("Bob", "P1", 1);

        Book b1 = new Book("Book1", "1", "A", "G");
        Book b2 = new Book("Book2", "2", "B", "G");

        assertTrue(member.borrowBook(b1));
        assertFalse(member.borrowBook(b2)); // exceeds limit
    }
}