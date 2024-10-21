/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge.pattern;

/**
 *
 * @author alialghanay
 */
abstract class Shape {
    protected IColor color;
    protected Shape(IColor c) {
        this.color = c;
    }
    abstract void drawShape(int border);
    abstract void modifyBorder(int border, int incement);
}
