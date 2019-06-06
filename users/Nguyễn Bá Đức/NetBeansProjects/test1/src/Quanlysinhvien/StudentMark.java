/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanlysinhvien;

import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class StudentMark {

    String rollNumber;
    String name;
    String classNo;
    String subject;
    float mark;

    public StudentMark() {

    }

    public StudentMark(String rollNumber, String name, String classNo, String subject, float mark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.classNo = classNo;
        this.subject = subject;
        this.mark = mark;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
            System.out.println("Nhap vao ma so sinh vien: ");
            rollNumber = input.nextLine();
            System.out.println("Nhap vao ten sinh vien: ");
            name = input.nextLine();
            System.out.println("Nhap vao lop hoc: ");
            classNo = input.nextLine();
            System.out.println("Nhap vao mon hoc: ");
            subject = input.nextLine();
            System.out.println("Nhap vao diem so: ");
            mark = input.nextFloat();
            

    }

    public void display() {
        System.out.println("Ma so sinh vien:" + rollNumber);
        System.out.println("Ho va ten:" + name);
        System.out.println("Lop: " + classNo);
        System.out.println("Mon hoc:" + subject);
        System.out.println("Diem: " + mark);

    }

}
