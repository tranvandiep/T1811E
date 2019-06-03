/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author DELL
 */
public abstract class Animals {
    String name;
    int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animals() {
    }
   public abstract void sound();
}
