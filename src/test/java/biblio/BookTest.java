package biblio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void bookCreatedWithAttributes() {
        Author author = new Author();
        Book book = new Book("title", author);
        assertEquals("title",book.getTitle());
        assertEquals(author, book.getAuthor());
    }
}