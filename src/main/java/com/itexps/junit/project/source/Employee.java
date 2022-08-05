/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.junit.project.source;

/**
 *
 * @author adrit
 */
public class Employee {
    
    private int eid;
    private String ename, email;

    public Employee(int eid, String ename, String email) {
        this.eid = eid;
        this.ename = ename;
        this.email = email;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public String getEmail() {
        return email;
    }
    
    
    
}
