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
public class AssignPeople implements AssignIInfo {
    String name;
    int age;
    String address;
    Scanner input = new Scanner(System.in);

    public AssignPeople() {
    }
    
    public void input() {
        System.out.print("Nhap ten: ");
        this.name = input.nextLine();
        System.out.print("Nhap tuoi: ");
        this.age = Integer.parseInt(input.nextLine());
        System.out.print("Nhap dia chi: ");
        this.address = input.nextLine();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public void showInfo() {
        
    }

    public AssignPeople(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
