/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class Student {
    public String fullname;
    public int age;
    public String email;
    public String address;
    public String rollNo;
    
    /*
    * Hàm tạo --> Hàm tạo mặc định --> hàm tạo không đối số 
    */
    
    public Student(){
        System.out.println("Ahihi");
    }
    /*
    * Hàm tạo 1 đối số
    * @param fullname
    */
    public Student(String fullame){
        // fullname biến local ở hàm tạo này.
        this.fullname = fullame;
        
    }
    
    public void learning() {
        System.out.println("I'm learning");
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        
    }
    public void display(){
            System.out.println("been dislayed");
    }

    public Student(String fullname, int age, String email, String address, String rollNo) {
        this.fullname = fullname;
        this.age = age;
        this.email = email;
        this.address = address;
        this.rollNo = rollNo;
    }
    
}
// public, private, protected là quyền truy cập
//