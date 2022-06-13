package biblio;

public class Book {


    // CONSTANTS / VARIABLES
    private Author author;
    private String title;

    // CONSTRUCTOR
    public Book(String title, Author author) {
        this.author = author;
        this.title = title;
        author.addBook(this);
    }

    // METHODS
    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

}
