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
public class People implements IInfor{
    String name;
    String address;
    String age;

    public People() {
    }

    public People(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    @Override
    public void showInfor() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", address=" + address + ", age=" + age + '}';
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap ten: ");
        name = input.nextLine();
        System.out.println("Nhap dia chi: ");
        address = input.nextLine();
        System.out.println("Nhap tuoi: ");
        age = input.nextLine();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
}
