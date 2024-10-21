/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bulider.pattern;

/**
 *
 * @author alialghanay
 */
public class BuliderPattern {

    public static void main(String[] args) {
      System.out.println("***Builder Pattern Demott***\n");
      Director director = new Director ();
      IBulider carBuilder = new Car ();
      IBulider motorBuilder = new MotorCycle () ;
      // Making Car
      director.Construct(carBuilder);
      Product p1 = carBuilder.getVehicle();
      p1.Show();
      //Making MotorCycle
      director.Construct(motorBuilder);
      Product p2 = motorBuilder.getVehicle();
      p2. Show() ;
    }
}
