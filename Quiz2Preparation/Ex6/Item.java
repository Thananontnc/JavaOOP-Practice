package Ex6;

public class Item {
    private String title;
    private String genre;

    public Item(String title,String genre) {
        this.title =title;
        this.genre = genre;
    }

    public void setTitle(String title) {
       this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }
    
    public String getGenre() {
        return this.genre;
    }

    public void diplayDetails() {
        System.out.println("The title of the item: "+this.title);
        System.out.println("The genre: "+this.genre);
    }

    public void addToLibrary() {
        System.out.println("The item has been added to the library.");
    }

    
}

class Main {
    public static void main(String[] args) {
        // Create Book object
        Item book = new Book("The Great Gatsby", "Fiction");
        book.displayDetails();  // Print details of the book
        book.addToLibrary();    // Add book to library

        // Create DVD object
        Item dvd = new DVD("Inception", "Science Fiction");
        dvd.displayDetails();  // Print details of the DVD
        dvd.addToLibrary();    // Add DVD to library
    }
}
