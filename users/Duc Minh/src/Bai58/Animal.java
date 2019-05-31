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
public class Animal implements IAnimal {

    private String name;
    private double weight;

    public Animal() {
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input name: ");
        name = input.nextLine();
        System.out.print("Input weight: ");
        weight = input.nextInt();
    }

    @Override
    public void dishplay() {
        System.out.print(toString());
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", weight=" + weight + '}';
    }

}
