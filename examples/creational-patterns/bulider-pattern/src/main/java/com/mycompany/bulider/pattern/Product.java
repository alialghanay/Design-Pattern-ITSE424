/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bulider.pattern;

import java.util.LinkedList;

/**
 *
 * @author alialghanay
 */
public class Product {
    private LinkedList<String> parts;
    
    public Product() {
        parts = new LinkedList<String>();
    }
    
    public void Add(String part) {
        parts.addLast(part);
    }
    
    public void Show() {
        System.out.println("\n product completed as below : ");
        for (int i = 0; i < parts.size(); i++){
            System.out.println(parts.get(i));
        }
    }
}
