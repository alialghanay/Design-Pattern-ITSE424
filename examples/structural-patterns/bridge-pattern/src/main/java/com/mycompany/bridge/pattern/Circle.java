/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge.pattern;

/**
 *
 * @author alialghanay
 */
public class Circle extends Shape{
    
    public Circle(IColor c){
        super(c);
    }

    @Override
    void drawShape(int border) {
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int incement) {
        border *= incement;
        drawShape(border);
    }
  
}
