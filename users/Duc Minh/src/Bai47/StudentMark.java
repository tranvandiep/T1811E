/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai47;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class StudentMark {

    String rollNum;
    String name;
    String classNo;
    String subject;
    double mark;

    public StudentMark() {
    }

    public StudentMark(String rollNum, String name, String classNo, String subject, double mark) {
        this.rollNum = rollNum;
        this.name = name;
        this.classNo = classNo;
        this.subject = subject;
        this.mark = mark;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
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

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ma sinh vien: ");
        rollNum = input.nextLine();
        System.out.println("Nhap ten: ");
        name = input.nextLine();
        System.out.println("Nhap lop: ");
        classNo = input.nextLine();
        System.out.println("Nhap ten mon: ");
        subject = input.nextLine();
        System.out.println("Nhap diem: ");
        mark = Double.parseDouble(input.nextLine());
    }

    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "StudentMark{" + "rollNum=" + rollNum + ", name=" + name + ", classNo=" + classNo + ", subject=" + subject + ", mark=" + mark + '}';
    }

    public static void main(String[] args) {
        StudentMark stdM1 = new StudentMark();
        StudentMark stdM2 = new StudentMark();

        stdM1.input();
        stdM2.input();

        stdM1.display();
        stdM2.display();

        System.out.println("Sinh vien co diem cao nhat la: ");
        if (stdM1.getMark() > stdM2.getMark()) {
            stdM1.display();
        } else {
            stdM2.display();
        }
    }
}
