/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.itexps.junit.project.source.Movie;
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
public class MovieTest {

    Movie movie;

    public MovieTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        movie = new Movie(1, 2022, "MOVIE1");
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void getId() {
        assertEquals(1, movie.getId());
    }

    @Test
    public void getName() {
        assertEquals("MOVIE1", movie.getName());
    }

    @Test
    public void getYear() {
        assertEquals(2022, movie.getYear());
    }

}
