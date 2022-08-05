package com.itexps.junit.project.source;

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adrit
 */
public class Store {
    
    private int sid;
    private String name, address;
    private List<Employee> employees;
    private List<Product> products;

    public Store(int sid, String name, String address, List<Employee> employees, List<Product> products) {
        this.sid = sid;
        this.name = name;
        this.address = address;
        this.employees = employees;
        this.products = products;
    }

    public List<Employee> getEmployees() {
        //employees.get(0)
        return employees;
    }

    public List<Product> getProducts() {
        return products;
    }
    
    public int getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
