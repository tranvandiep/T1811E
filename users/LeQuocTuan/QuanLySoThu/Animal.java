/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.QuanLySoThu;

import java.util.Scanner;

/**
 *
 * @author LQT
 */
public abstract class Animal {
    private String name;
    private int age;
    private String description;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
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

    
    public void showInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Description : " + description);
    }
    
    abstract void showSound();
    
    public void inputAnimal(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten : ");
        name = input.nextLine();
        System.out.println("Nhap tuoi : ");
        age = Integer.parseInt(input.nextLine());
        System.out.println("Nhap mo ta : ");
        description = input.nextLine();
    }
}
