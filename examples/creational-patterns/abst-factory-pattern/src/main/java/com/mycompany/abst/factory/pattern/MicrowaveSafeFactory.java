/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abst.factory.pattern;

/**
 *
 * @author alialghanay
 */
public class MicrowaveSafeFactory implements AbstractUtensilFactory{
    
    public Utensil getPlate() {
    return new Plate_MW();
      }
    public Utensil getBowl() {
        return new Bowl_MW();
    }
    public Utensil getCup() {
        return new Cup_MW();
    }
}
