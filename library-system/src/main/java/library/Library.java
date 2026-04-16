import java.util.ArrayList;

public class Library extends LibraryItem{
    private ArrayList<Book> books;

    public Library(String title, String id, ArrayList<Book> books) {
        super(title, id);
        this.books = new ArrayList<>(books);
    }


    public void addBook(Book book) {

    }

    public void removeBook(String id) {
        
    }

    public void searchBook(String title){

    }


    
}
