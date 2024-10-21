/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype.pattern;

/**
 *
 * @author alialghanay
 */
public class Samsung extends SmartPhone {
    public Samsung(String model) {
        this.setModel(model);
    }

    @Override
    public SmartPhone clone() throws CloneNotSupportedException {
        return (Samsung) super.clone();
    }
}
