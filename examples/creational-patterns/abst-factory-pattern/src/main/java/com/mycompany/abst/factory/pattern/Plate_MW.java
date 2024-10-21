/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abst.factory.pattern;

/**
 *
 * @author alialghanay
 */
public class Plate_MW implements Utensil{
    String type;
    Double Price;
    Double size;
    
    public Plate_MW() {
        this.type = "PALTE";
        this.Price= 8.50;
        this.size= 15.00;
    }
    @Override
    public String getType() {
      return type;
    }

    @Override
    public Double getPrice() {
        return Price;
    }

    @Override
    public Double getSize() {
        return size;
    }
    
}
