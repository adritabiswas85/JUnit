/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.itexps.junit.project.source.Employee;
import com.itexps.junit.project.source.Product;
import com.itexps.junit.project.source.Store;
import java.util.Arrays;
import java.util.List;
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
public class StoreTest {
    Store store;
    
    public StoreTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
        Employee employee1 = new Employee(1, "emp1", "emp1@gmail.com");
        Employee employee2 = new Employee(2, "emp2", "emp2@gmail.com");
        List<Employee> employeeList = Arrays.asList(employee1, employee2);
        
        Product product1 = new Product(1, "pro1", "50dollar");
        Product product2 = new Product(2, "pro2", "60dollar");
        List<Product> productList = Arrays.asList(product1, product2);
        
        store = new Store(1, "Target", "1234 Rd", employeeList, productList);
       
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void getSid() {
        assertEquals(1,store.getSid());
    }
    
    @Test
    public void getName() {
        assertEquals("Target",store.getName());
    }
    
    @Test
    public void getAddress() {
        assertEquals("1234 Rd",store.getAddress());
    }
    
    @Test
    public void getEmployees() {
        assertNotNull(store.getEmployees());
        assertEquals(2, store.getEmployees().size());
    }
    
     @Test
    public void getProducts() {
        assertNotNull(store.getProducts());
        assertEquals(2, store.getProducts().size());
    }
}
