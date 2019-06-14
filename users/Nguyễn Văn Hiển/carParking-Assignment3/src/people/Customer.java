/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Customer {
    private int id;
    private String name;
    private int age;
    private String address;
    private String gender;
    private int birthYear;
    Scanner input = new Scanner(System.in);

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    
    
    public void inputCustom() {
        System.out.print("Ma khach hang: ");
        this.id = Integer.parseInt(input.nextLine());
        System.out.print("Ho ten: ");
        this.name = input.nextLine();
        System.out.print("Tuoi: ");
        this.age = Integer.parseInt(input.nextLine());
        System.out.print("Dia chi: ");
        this.address = input.nextLine();
        System.out.print("Gioi tinh: ");
        this.gender = input.nextLine();
        System.out.print("Ngay sinh: ");
        this.birthYear = Integer.parseInt(input.nextLine());
    }

    public String toString() {
        return ("Khach hang: " +name 
                +"\nMa so: " +id 
                +"\nTuoi: " + age 
                +"Dia chi: " +address 
                +"Gioi tinh: " +gender 
                +"Ngay sinh: " +birthYear);
    }

    public void displayCustom() {
        System.out.print(toString());
    }
    
    public Customer(int id, String name, int age, String address, String gender, int birthYear) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.birthYear = birthYear;
    }
}
