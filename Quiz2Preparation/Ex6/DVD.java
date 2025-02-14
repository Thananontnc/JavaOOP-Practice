package Ex6;

public class DVD extends Item {

    // Constructor for DVD
    public DVD(String title, String genre) {
        super();  // Calling the parent constructor
        this.title = title;
        this.genre = genre;
    }

    // Override the addToLibrary() method for DVD
    @Override
    public void addToLibrary() {
        System.out.println("The DVD has been added to the library.");
    }

    // Method specific to DVD
    public void addDVD() {
        System.out.println("The DVD is being cataloged.");
    }
}
