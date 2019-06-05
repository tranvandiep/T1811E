/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt58;

import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class Chicken extends Animal{
    private int numberOfLeg;

    public Chicken() {
    }

    public Chicken(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    public Chicken(int numberOfLeg, String name, double weight) {
        super(name, weight);
        this.numberOfLeg = numberOfLeg;
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("numberOfLeg: " + numberOfLeg);
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap numberOfLeg:  ");
        numberOfLeg = Integer.parseInt(input.nextLine());
    }

    public int getNumberOfLeg() {
        return numberOfLeg;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }
    
}
