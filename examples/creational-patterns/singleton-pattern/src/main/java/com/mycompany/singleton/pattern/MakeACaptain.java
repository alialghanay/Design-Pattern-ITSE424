/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton.pattern;

/**
 *
 * @author alialghanay
 */
public class MakeACaptain {
    private static MakeACaptain _captain;
    private MakeACaptain() {}
    
    public static MakeACaptain getCaptain() {
        synchronized (MakeACaptain.class) {
            if (_captain == null) {
                _captain = new MakeACaptain();
                System.out.println("New Captain selected for our team");
            } else {
                System.out.println("You already have a Captain for team");
                System.out.println("Send him for the toss");
            }
        }
        return _captain;
    }
}
