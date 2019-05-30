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
public class AnimalCat extends Animal {
    private String color;

    public AnimalCat() {
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void input() {
        super.input(); 
    }

    
    
    public AnimalCat(String color, String name, Double weight) {
        super(name, weight);
        this.color = color;
    }
    
    
}
