/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt47;

import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class Employee {
    String fullname;
    String gender;
    String address;
    String position;
    double salary;

    public Employee() {
    }

    public Employee(String fullname, String gender, String address, String position, double salary) {
        this.fullname = fullname;
        this.gender = gender;
        this.address = address;
        this.position = position;
        this.salary = salary;
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap ten nhan vien: ");
        fullname = input.nextLine();
        
        System.out.println("Nhap gioi tinh: ");
        gender = input.nextLine();
        
        System.out.println("Nhap dia chi: ");
        address = input.nextLine();
        
        System.out.println("Nhap vi tri: ");
        position = input.nextLine();
        
        System.out.println("Nhap luong: ");
        salary = Float.parseFloat(input.nextLine());
    }
    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Employee{" + "fullname=" + fullname + ", gender=" + gender + ", address=" + address + ", position=" + position + ", salary=" + salary + '}';
    }
    
    public String getFullname() {
        return fullname;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
