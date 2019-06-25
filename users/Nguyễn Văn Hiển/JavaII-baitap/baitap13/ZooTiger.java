/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

/**
 *
 * @author PC
 */
public class ZooTiger extends ZooAnimal {

    public ZooTiger() {
    }

    @Override
    public void sound() {
        System.out.println("Graooooo"); 
    }

    
    
    public ZooTiger(String name, int age, String description) {
        super(name, age, description);
    }
    
}
