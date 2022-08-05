/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adrit
 */
public class Book {
    
    private int id, price;
    private String title, author;

    public Book(int id, int price, String title, String author) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.author = author;   
        
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return title;
    }
        
}
