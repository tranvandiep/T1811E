/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession3;

import java.util.Scanner;

/**
 *
 * @author Diep.Tran
 */
public class Student {
    //public, private, protected
    private String fullname;
    protected int age;
    public String email;
    public String address;
    public String rollNo;
    
    /**
     * Ham tao -> ham tao mac dinh & ham tao ko doi so
     */
    public Student() {
        System.out.println("Goi toi ham tao mac dinh");
    }
    
    /**
     * ham tao 1 doi so
     * @param fullname 
     */
    public Student(String fullname) {
//        String fullname;
        
        this.fullname = fullname;
        
//        showFullname(this.fullname);
    }
    
//    public void showFullname(String fullname) {
//        System.out.println("Fullname : " + fullname);
//    }
    
//    public Student(String address) {
//        this.address = address;
//    }

    public Student(String fullname, int age, String email, String address, String rollNo) {
        this.fullname = fullname;
        this.age = age;
        this.email = email;
        this.address = address;
        this.rollNo = rollNo;
    }
    
    /**
     * Ham tao ko nen dung.
     * @param abc
     * @param xyz 
     */
    public Student(String abc, String xyz) {
        
    }
    
    public void learning() {
        //block code
        System.out.println("I'm learning");
    }
    
    public void input() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap ten : ");
        fullname = input.nextLine();
        
        System.out.println("Nhap tuoi : ");
        age = Integer.parseInt(input.nextLine());
        
        System.out.println("Nhap email : ");
        email = input.nextLine();
        
        System.out.println("Nhap dia chi : ");
        address = input.nextLine();
        
        System.out.println("Nhap MSV : ");
        rollNo = input.nextLine();
    }
    
    public void display() {
        System.out.println("Fullname : " + fullname);
    }
    
    public void running() {
        System.out.println("I'm running");
    }
}
