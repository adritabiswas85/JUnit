/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.itexps.junit.project.source.Calculator;
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
public class CalculatorTest {
    Calculator cal;
    public CalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("setUpClass");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("setUp");
        cal = new Calculator();
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("tearDown");
    }

    
    @Test
    public void add() {
        System.out.println("add");
    assertEquals(4, cal.add(2, 2));
    }
    
    @Test
    public void mul() {
        System.out.println("mul");
    assertEquals(4, cal.mul(2, 2));
    }
    
}
