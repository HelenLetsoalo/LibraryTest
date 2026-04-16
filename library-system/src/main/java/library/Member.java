import java.util.ArrayList;

public class Member {
    private String name;
    private String memberID;
    private ArrayList<Book> borrowedBooks;

    public Member (String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.getAvailability()) {
            borrowedBooks.addBook();
            borrowedBooks.removeBook();
            book.checkoutItem();
            System.out.println("You have succefully borrowed this book");
           
        } else {
            System.out.println("This book is unavailable");
        }

    }


    
}
