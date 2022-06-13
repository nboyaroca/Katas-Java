package biblio;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Author {

    private String name;
    // private List<Book> bookList = new ArrayList<>();
    private Set<Book> bookList = new HashSet<>();


    public int countBooks() {
        return this.bookList.size();
    }

    public void addBook(Book book) { //Classe Book que es del tipus book nom de la variable que pasem per paràmetre
        //if (this.bookList.contains(book)) return; // CLÀUSULA DE SALVAGUARDA // no cal amb el Set
        this.bookList.add(book);
    } //addBook és nom del mètode

}
