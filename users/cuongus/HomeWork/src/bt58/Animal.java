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
public class Animal implements IAnimal {
    private String name;
    private double weight;

    public Animal() {
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap ten: ");
        name = input.nextLine();
        
        System.out.println("Nhap can nang: ");
        weight = Float.parseFloat(input.nextLine());
    }

    @Override
    public void display() {
        System.out.println("Ten: " + name + "Can nang: " + weight);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}
