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
import java.util.Scanner;

public abstract class ZooAnimal {
    String name;
    int age;
    String description;
    
    Scanner input = new Scanner(System.in);

    public ZooAnimal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void inputInfo() {
        System.out.print("Nhap ten dong vat: ");
        this.name = input.nextLine();
        System.out.print("Nhap tuoi: ");
        this.age = Integer.parseInt(input.nextLine());
        System.out.print("Nhap mieu ta: ");
        this.description = input.nextLine();
    }
    
    public void showInfo() {
        System.out.println(toString());
    }

    
    public String toString() {
        return (name +" - " +age +" - " +description);
    }
    
    public abstract void sound();

    public ZooAnimal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }
    
    
}
