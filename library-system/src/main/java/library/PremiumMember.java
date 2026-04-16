import java.util.ArrayList;

public class PremiumMember extends Member {
    private int maxBooksAllowed;

    public PremiumMember(String name, String memberID, String[] borrowedBooks, int maxBooksAllowed) {
        super(name, memberID, borrowedBooks);
        this.maxBooksAllowed = maxBooksAllowed;

    }
    @Override
    void borrowBook() {
        
    }

    
}
