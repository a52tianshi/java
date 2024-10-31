package design_pattern.chapter_1_interator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    void getName() {
        Book book = new Book("Design Pattern");
        assertEquals("Design Pattern", book.getName());
        Book book2 = new Book("Refactoring");
        assertEquals("Refactoring", book2.getName());
        book2.SetName("Refactoring 2nd Edition");
        assertEquals("Refactoring 2nd Edition", book2.getName());
    }
}