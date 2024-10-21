/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singleton.pattern;

/**
 *
 * @author alialghanay
 */
public class SingletonPattern {

    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");
        MakeACaptain c1 = MakeACaptain. getCaptain () ;
        System. out.println("Trying to make another captain for our team") ;
        MakeACaptain c2 = MakeACaptain. getCaptain () ;
        if (c1 == c2) {
            System.out.println("cl and c2 are same instance");
        }
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");
        MakeACaptainEgger c3 = MakeACaptainEgger.getCaptain();
        System. out.println("Trying to make another captain for our team") ;
        MakeACaptainEgger c4 = MakeACaptainEgger.getCaptain();
        if (c3 == c4) {
            System.out.println("c3 and c4 are same instance");
        }
    }
}
