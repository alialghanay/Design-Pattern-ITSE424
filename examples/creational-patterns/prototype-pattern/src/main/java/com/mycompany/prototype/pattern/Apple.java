/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype.pattern;

/**
 *
 * @author alialghanay
 */
public class Apple extends SmartPhone {

    public Apple(String model) {
        this.setPrice(900);
        this.setPrice(700);
        this.setModel(model);
    }

    @Override
    public SmartPhone clone() throws CloneNotSupportedException {
        return (Apple) super.clone();
    }

       
}