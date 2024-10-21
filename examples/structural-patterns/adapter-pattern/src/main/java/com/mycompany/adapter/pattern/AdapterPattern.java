/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adapter.pattern;

import java.util.Scanner;

/**
 *
 * @author alialghanay
 */
public class AdapterPattern {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("enter your rect w then h:");
        System.out.println("w:");
        double w  = Double.parseDouble(scaner.nextLine());
        System.out.println("\nh:");
        double h  = Double.parseDouble(scaner.nextLine());
        Rect r = new Rect(w, h);
        Calculator c = new Calculator();
        System.out.println("rectangle area is = " + c.getArea(r));
        
        
        System.out.println("enter your triangle b then h:");
        System.out.println("b:");
        double b  = Double.parseDouble(scaner.nextLine());
        System.out.println("\nh2:");
        double h2  = Double.parseDouble(scaner.nextLine());
        Triangle t = new Triangle(b, h2);
        CalculatorAdapter c2 = new CalculatorAdapter();
        System.out.println("rectangle area is = " + c2.getArea(t));
    }
}
