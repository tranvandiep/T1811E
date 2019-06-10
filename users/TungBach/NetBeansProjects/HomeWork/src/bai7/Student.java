/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student extends Person{
    String rollNo;
    float mark;
    String email;

    public Student() {
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("; rollNo:" + rollNo + "; mark: " +mark+ ";email: "+email);
        System.out.println("");
    }
    
    
    
    public void inputInfo(){
        super.inputInfo();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        while(true){
            String rollNoInput = input.nextLine();
            boolean check = setRollNo(rollNoInput);
            if(check){
                break;
            }
        }
        
        System.out.println("Nhap diem sinh vien: ");
        while(true){
            float markInput = Float.parseFloat(input.nextLine());
            boolean check = setMark(markInput);
            if(check){
                break;
            }
        }
        
        System.out.println("Nhap email sinh vien: ");
        while(true){
            String emailInput = input.nextLine();
            boolean check = setEmail(emailInput);
            if(check){
                break;
            }
        }
        
    }
    
    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if(rollNo == null && rollNo.length()!=8){
            System.out.println("Nhap lai ma sinh vien");
            return true;
        }else{
            this.rollNo = rollNo;
            return false;
        }
        
    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if(mark >=0 && mark <= 10){
           this.mark = mark;
           return true;
        }else{
            System.out.println("Nhap sai diem");
            return false;
        }    
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email != null && email.contains("@") && !email.contains("")){
            this.email = email;
            return true;
        }else{
            System.out.println("Nhap lai dia chi email");
            return false;
        }
        
    }
    
    public boolean checkScholarship(){
        if(mark >= 8){
            return true;
        }
        return false;
    }
    
}
