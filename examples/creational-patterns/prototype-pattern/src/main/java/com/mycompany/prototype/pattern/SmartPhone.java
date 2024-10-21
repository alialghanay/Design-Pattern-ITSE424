/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype.pattern;

/**
 *
 * @author alialghanay
 */
public abstract class SmartPhone implements Cloneable {
    private String model;
    private String brand;
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public SmartPhone clone() throws CloneNotSupportedException {
        return (SmartPhone) super.clone();  
    }

    @Override
    public String toString() {
        return "SmartPhone [Model=" + model + ", Brand=" + brand + ", Price=" + price + "]";
    }
}