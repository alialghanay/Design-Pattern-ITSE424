/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter.pattern;

/**
 *
 * @author alialghanay
 */
public class Calculator {
    Rect r;
    
    public double getArea(Rect r){
        this.r = r;
        return r.w * r.h;
    }
}
