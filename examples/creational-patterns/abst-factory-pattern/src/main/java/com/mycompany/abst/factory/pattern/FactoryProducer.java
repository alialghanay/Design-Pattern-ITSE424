/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abst.factory.pattern;

/**
 *
 * @author alialghanay
 */
public class FactoryProducer {
  
    public static AbstractUtensilFactory getFactory(String choice){
        if("Microwave".equalsIgnoreCase(choice)){
            return new MicrowaveSafeFactory();
        }
        else if("Non-Microwave".equalsIgnoreCase(choice)){
            return new NonMicrowaveSafeFactory();
        }
        return null;
    }
}
