/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bulider.pattern;

/**
 *
 * @author alialghanay
 */
public class Car implements IBulider{
    private Product product = new Product();
    @Override
    public void BulidBody() {
       product.Add("this is a body of a car");
    }

    @Override
    public void InserttWheels() {
      product.Add("4 wheels are added");
    }

    @Override
    public void AddHeadLights() {
        product.Add("2 HeadLights are added");
    }

    @Override
    public Product getVehicle() {
       return product;
    }
}
