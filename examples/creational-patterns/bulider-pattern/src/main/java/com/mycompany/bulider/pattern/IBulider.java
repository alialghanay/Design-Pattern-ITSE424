/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bulider.pattern;

/**
 *
 * @author alialghanay
 */
interface IBulider {
    void BulidBody();
    void InserttWheels();
    void AddHeadLights();
    Product getVehicle();
}
