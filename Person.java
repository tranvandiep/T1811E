/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Person {
    private String Fullname;
    private String Gender;
    private String dateyear;
    private String address;

    public Person() {
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDateyear() {
        return dateyear;
    }

    public void setDateyear(String dateyear) {
        this.dateyear = dateyear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void inputIfno(){
        Scanner input =new Scanner(System.in);
        System.out.println("Nhap ten : ");
        Fullname = input.nextLine();
        System.out.println("Nhap gioi tinh: ");
        Gender = input.nextLine();
        System.out.println("Nhap ngay sinh:");
        dateyear =input.nextLine();
        System.out.println("Nhap đia chi: ");
        address =input.nextLine();
    }
    public void showInfo(){
        System.out.println("ten: "+Fullname);
        System.out.println("gioi tinh: "+Gender);
        System.out.println("ngay sinh: "+dateyear);
        System.out.println("dia chi: "+address);
    }
    
}
