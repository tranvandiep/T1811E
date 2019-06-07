/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt522;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class People implements IInfor{
    
    String name;
    int age;
    String address;
    
    @Override
    public void showInfor() {
        System.out.printf("Ten: %s",name);
        System.out.printf("Tuoi: %d", age);
        System.out.printf("Dia chi: %s",address);
    }

    public People() {
    }

    public People(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Scanner getInput() {
        return input;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
    
    
    
    Scanner input = new Scanner(System.in);
    public void input(){
        System.out.printf("Nhap ten: ");
        name = input.nextLine();
        System.out.printf("Nhap tuoi: ");
        age = Integer.parseInt(input.nextLine());
        System.out.printf("Nhap dia chi: ");
        address = input.nextLine();
    }
}
