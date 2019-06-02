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
public class ZooDog extends ZooAnimal {

    public ZooDog() {
    }

    @Override
    public void showInfo() {
        super.showInfo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inputInfo() {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sound() {
        System.out.println("Gau gau");
    }

    public ZooDog(String name, int age, String description) {
        super(name, age, description);
    }
}
