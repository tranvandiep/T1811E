/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai58;

import java.util.Scanner;

/**
 *
 * @author giangduy
 */
public class Chicken extends Animal{
    private int numberOfLeg;

    public Chicken() {
    }

    public Chicken(int numberOfLeg, String name, double weight) {
        super(name, weight);
        this.numberOfLeg = numberOfLeg;
    }

    public int getNumberOfLeg() {
        return numberOfLeg;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("Input legs: ");
        numberOfLeg = input.nextInt();
    }

    @Override
    public void dishplay() {
        super.dishplay();
        System.out.print(toString());
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Chicken{" + "numberOfLeg=" + numberOfLeg + '}';
    }
}
