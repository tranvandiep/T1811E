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
public class ZooCat extends ZooAnimal {
    
    public ZooCat() {
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }

    @Override
    public void inputInfo() {
        super.inputInfo(); 
    }
    
    
    @Override
    public void sound() {
        System.out.println("Meo meo");
    }

    
    
    public ZooCat(String name, int age, String description) {
        super(name, age, description);
    }
    
}
