/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt7;

import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class Person {
    String fullName;
    String gender;
    String bDate;
    String address;

    public Person() {
    }

    public Person(String fullName, String gender, String bdate, String address) {
        this.fullName = fullName;
        this.gender = gender;
        this.bDate = bdate;
        this.address = address;
    }
    
    //getter
    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getBdate() {
        return bDate;
    }

    public String getAddress() {
        return address;
    }
    
    //setter
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBdate(String bdate) {
        this.bDate = bdate;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap ho ten: ");
        fullName = input.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gender = input.nextLine();
        System.out.println("Nhap ngay sinh: ");
        bDate = input.nextLine();
        System.out.println("Nhap dia chi: ");
        address = input.nextLine();
    }
    
    public void showInfo(){
        System.out.println("ho ten: " + fullName);
        
        System.out.println("gioi tinh: " + gender);
        
        System.out.println("ngay sinh: " + bDate);
       
        System.out.println("dia chi: " + address);
        
    }
}
