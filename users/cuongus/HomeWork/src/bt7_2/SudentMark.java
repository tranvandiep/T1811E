/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt7_2;

import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class SudentMark {
    String rollNo;
    String fullname;
    String classname;
    String subject;
    float mark;

    public SudentMark() {
    }

    public SudentMark(String rollNo, String fullname, String classname, String subject, float mark) {
        this.rollNo = rollNo;
        this.fullname = fullname;
        this.classname = classname;
        this.subject = subject;
        this.mark = mark;
    }
    public static void main(String[] args) {
        SudentMark stdMark1 = new SudentMark();
        stdMark1.input();
        
        SudentMark stdMark2 = new SudentMark("A2019", "B", "TA111", "LangC", 1);
        
        stdMark1.display();
        stdMark2.display();
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho ten sinh vien: ");
        fullname = input.nextLine();
        
        System.out.println("Nhap ma sinh vien: ");
        rollNo = input.nextLine();
        
        System.out.println("Nhap ten lop: ");
        classname = input.nextLine();
        
        System.out.println("Nhap ten mon: ");
        subject = input.nextLine();
        
        System.out.println("Nhap diem: ");
        mark = Float.parseFloat(input.nextLine());
    }
    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SudentMark{" + "rollNo=" + rollNo + ", fullname=" + fullname + ", classname=" + classname + ", subject=" + subject + ", mark=" + mark + '}';
    }
    
    
    public String getRollNo() {
        return rollNo;
    }

    public String getFullname() {
        return fullname;
    }

    public String getClassname() {
        return classname;
    }

    public String getSubject() {
        return subject;
    }

    public float getMark() {
        return mark;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    
    
}
