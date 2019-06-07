/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT7;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Person {
        String fullname;
        String gender;
        String birth;
        String address;

        Scanner input = new Scanner(System.in);
                
    public Person() {
    }
        
     public Person(String fullname, String gender, String birth, String address) {
        this.fullname = fullname;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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
        System.out.printf("Nhap ten: ");
        fullname = input.nextLine();
        
        System.out.printf("Nhap gioi tinh: ");
        gender = input.nextLine();
        
        System.out.printf("Nhap ngay sinh: ");
        birth = input.nextLine();
        
        System.out.printf("Nhap dia chi: ");
        address = input.nextLine();
    }
    
    public void showInfo() {
        System.out.println("Ten la: " +fullname);
        System.out.println("Gioi tinh la: " +gender);
        System.out.println("Ngay sinh la: " +birth);
        System.out.println("Dia chi la: " +address);
    }
     
}
