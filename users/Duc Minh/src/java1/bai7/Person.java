/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Person {

    String name;
    String gender;
    String birth;
    String address;

    public Person() {
    }

    public Person(String name, String gender, String birth, String address) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        name = input.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gender = input.nextLine();
        System.out.print("Nhap ngay sinh: ");
        birth = input.nextLine();
        System.out.print("Nhap dia chi: ");
        address = input.nextLine();
    }

    public void showInfo() {
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", birth=" + birth + ", address=" + address + '}';
    }

}
