/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter.pattern;

/**
 *
 * @author alialghanay
 */
public class CalculatorAdapter {
    Calculator calculator;
    Triangle triangle;
    
    public double getArea(Triangle t){
        calculator = new Calculator();
        triangle = t;
        double h = 0.5 * triangle.h;
        double w = triangle.b;
        Rect r = new Rect(w, h);
        return calculator.getArea(r);
    }
}
