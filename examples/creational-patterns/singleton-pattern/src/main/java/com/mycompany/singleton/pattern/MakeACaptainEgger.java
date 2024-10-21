/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton.pattern;

/**
 *
 * @author alialghanay
 */
public class MakeACaptainEgger {
     private static MakeACaptainEgger  _captain = new MakeACaptainEgger();
        private MakeACaptainEgger() {}
    
    public static MakeACaptainEgger getCaptain() {
        return _captain;
    }
}
