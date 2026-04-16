public class Book extends LibraryItem {
    private String author;
    private String genre;

    public Book (String title, String id,String author, String genre) {
        super(title, id);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return getTitle() + "Author: " + author + "Genre: " + genre;
    }
    
}
