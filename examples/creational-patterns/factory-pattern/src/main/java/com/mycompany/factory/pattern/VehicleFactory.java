/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory.pattern;

/**
 *
 * @author alialghanay
 */
public class VehicleFactory {
    public Vehicle getVehicle(String vehcileType) {
         if(vehcileType == null){
            return null;
        }
        
         if (vehcileType.equalsIgnoreCase("Car")) {
             return new Car();
         }
         
         if (vehcileType.equalsIgnoreCase("Bike")){
             return new Bike();
         }
         
        return null;
    }
}
