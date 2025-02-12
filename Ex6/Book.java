package Ex6;

public class Book extends Item {

    public Book(String title,String genre) {
        super();
        this.title = title;
        this.genre = genre;
    }

    

    public void addBook() {
        System.out.println("The book has been added to the library");

    }    

    @Override
    public void addBook() {
        System.out.println("The book is being cataloged.");
    }
    

}
