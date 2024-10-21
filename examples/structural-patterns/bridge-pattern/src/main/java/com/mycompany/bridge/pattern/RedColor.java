/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge.pattern;

/**
 *
 * @author alialghanay
 */
public class RedColor implements IColor {

    @Override
    public void fillWithColor(int border) {
        System.out.println("Color Red with Border = " + border);
    }
    
}
