/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bridge.pattern;

/**
 *
 * @author alialghanay
 */
public class BridgePattern {

    public static void main(String[] args) {
        System.out.println ("\nColoring Circle:");
        IColor red = new RedColor ();
        Shape circleShape= new Circle(red);
        circleShape.drawShape(20);
        circleShape.modifyBorder(20, 3);
        
        // blue square
        System.out.println("\nColoring Square:");
        IColor blue= new BlueColor();
        Shape squareShape= new Square(blue);
        squareShape.drawShape(20);
        squareShape.modifyBorder(20, 3);
    }
}
