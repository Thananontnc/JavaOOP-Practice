public class Book { 
    private String title;
    private String author;
    private int yearPublished;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.yearPublished = 0;
    }
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.yearPublished = 0;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.yearPublished = 0;
    }
    public Book(String title, String author,int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Set Method

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void addBook() {
        
    }
    
    // Get Method
    public String getTitle() {
        return  this.title;
    }
    public String getAuthor() {
        return  this.author;
    }
    public int getYearPublished() {
        return  this.yearPublished;
    }
    


}
