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
public class AnimalChicken extends Animal {
    private int numOfLeg;

    public AnimalChicken() {
    }

    public int getNumOfLeg() {
        return numOfLeg;
    }

    public void setNumOfLeg(int numOfLeg) {
        this.numOfLeg = numOfLeg;
    }

    @Override
    public void display() {
        super.display(); 
    }

    @Override
    public void input() {
        super.input();
    }

    
    
    
    public AnimalChicken(int numOfLeg, String name, Double weight) {
        super(name, weight);
        this.numOfLeg = numOfLeg;
    }
    
    
}
