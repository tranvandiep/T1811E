/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt522;

import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class Car implements IInfor{
    String name;
    String color;

    public Car() {
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    @Override
    public void showInfor() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", color=" + color + '}';
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap ten xe: ");
        name = input.nextLine();
        
        System.out.println("Nhap mau sac xe: ");
        color = input.nextLine();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
