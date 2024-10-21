/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abst.factory.pattern;

/**
 *
 * @author alialghanay
 */
public class AbstFactoryPattern {

    public static void main(String[] args) {
       AbstractUtensilFactory utensilFactory = FactoryProducer.getFactory ("Microwave") ;
        Utensil utensil = utensilFactory.getPlate () ;
        System.out.println("the Price :"+ utensil.getPrice () + "," + "the size :" + utensil.getSize()+ "," + "the type :" +utensil.getType());
    }
}
