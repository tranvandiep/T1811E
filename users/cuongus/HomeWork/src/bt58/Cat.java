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
public class Cat extends Animal{
    private String color;

    public Cat() {
    }

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String color, String name, double weight) {
        super(name, weight);
        this.color = color;
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Mau sac: " + color);
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap mau sac: ");
        color = input.nextLine();
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
