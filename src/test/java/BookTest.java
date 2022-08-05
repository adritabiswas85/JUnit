/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adrit
 */
public class BookTest {

    Book book;

    public BookTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @AfterEach
    public void tearDown() {
    }

    @BeforeEach
    public void setUp() {
        book = new Book(1, 50, "Book1", "Bob");
    }

    @Test
    public void getId() {
        assertEquals(1, book.getId());
    }

    @Test
    public void getPrice() {
        assertEquals(50, book.getPrice());
    }

    @Test
    public void getTitle() {
        assertEquals("Book1", book.getTitle());
    }

    @Test
    public void getAuthor() {
        assertEquals("Bob", book.getAuthor());

    }
}
