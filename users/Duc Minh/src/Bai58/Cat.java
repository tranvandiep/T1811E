/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai58;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Cat extends Animal {

    private String color;

    public Cat() {
    }

    public Cat(String color, String name, double weight) {
        super(name, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("Input color: ");
        color = input.nextLine();
    }

    @Override
    public void dishplay() {
        super.dishplay();
        System.out.print(toString());
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Cat{" + "color=" + color + '}';
    }

}
