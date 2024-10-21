/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factory.pattern;

import java.util.Scanner;

/**
 *
 * @author alialghanay
 */
public class FactoryPattern {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("You Have to Choise A Vehcile:\n");
      String input = scanner.nextLine();
      Vehicle someVehicle = new VehicleFactory().getVehicle(input);
      someVehicle.drive();
    }
}
