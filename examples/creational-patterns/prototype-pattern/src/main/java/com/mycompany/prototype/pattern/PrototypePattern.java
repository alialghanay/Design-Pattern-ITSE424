/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prototype.pattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alialghanay
 */
public class PrototypePattern {

    public static void main(String[] args) {
       SmartPhone note10 = new Samsung("Note10");
    SmartPhone iphonex = new Apple("iPhonex");

    System.out.println(note10);
    System.out.println(iphonex);

    System.out.println("=== Products for VIPs ===");
    SmartPhone note10Gold;
        try {
            note10Gold = note10.clone();
            note10Gold.setPrice(50);
            System.out.println(note10Gold);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(PrototypePattern.class.getName()).log(Level.SEVERE, null, ex);
        }
    


    System.out.println(iphonex);
    }
}
