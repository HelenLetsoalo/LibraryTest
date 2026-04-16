public class LibraryItem {
    private String title;
    private String id;
    private boolean isAvailable;

    public LibraryItem(String title, String id){
        this.title = title;
        this .id = id;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    
    public void setID(String newId) {
        this.id = newId;
    }

    public void setAvailability(boolean newAvailability) {
        this.isAvailable = newAvailability;
    }

    public void checkoutItem(){
        isAvailable = false;
    }

    public void returnItem() {
        isAvailable = true;

    }
}
