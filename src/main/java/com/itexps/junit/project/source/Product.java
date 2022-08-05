/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.junit.project.source;

/**
 *
 * @author adrit
 */
public class Product {
    private int pid;
    private String pname, price;

    public Product(int pid, String pname, String price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public String getPrice() {
        return price;
    }    
}
