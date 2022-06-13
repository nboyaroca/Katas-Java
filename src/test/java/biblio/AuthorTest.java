package biblio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void authorCanCount() {
        Author author = new Author();
        Book book = new Book("title", author);

        assertEquals(1, author.countBooks());
    }

    @Test
    void authorCanAddABook() {
        Author author = new Author();
        Book book = new Book("title", author);

        assertEquals(1, author.countBooks());
    }
}