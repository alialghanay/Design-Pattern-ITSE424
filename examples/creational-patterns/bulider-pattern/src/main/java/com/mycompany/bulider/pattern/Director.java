/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bulider.pattern;

/**
 *
 * @author alialghanay
 */
public class Director {
    IBulider myBulider;
    
    public void Construct(IBulider bulider){
        myBulider = bulider;
        myBulider.BulidBody();
        myBulider.InserttWheels();
        myBulider.AddHeadLights();
    }
}
