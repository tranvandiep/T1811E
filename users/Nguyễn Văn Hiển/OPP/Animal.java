/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Animal implements AnimalInterface {
    private String name;
    private Double weight;
    Scanner input = new Scanner(System.in);

    public Animal() {
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    
    public Animal(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    
    @Override
    public void input() {
        System.out.print("Nhap ten con vat: ");
        this.name = input.nextLine();
        System.out.print("Nhap can nang: ");
        this.weight = input.nextDouble();
    }

    @Override
    public void display() {
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return ("\nTen: " + name + 
                " - Can nang: " + weight);
    }
    
    
}
