/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Student extends Person {

    String rollNo;
    float avgMark;
    String email;

    public Student() {
    }

    public Student(String rollNo, int avgMark, String email) {
        this.rollNo = rollNo;
        this.avgMark = avgMark;
        this.email = email;
    }

    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if (rollNo != null && rollNo.length() == 8) {
            this.rollNo = rollNo;
            return true;
        } else {
            System.err.print("Nhap lai!");
            return false;
        }
    }

    public float getAvgMark() {
        return avgMark;
    }

    public boolean setAvgMark(float avgMark) {
        if (avgMark >= 0 && avgMark <= 10) {
            this.avgMark = avgMark;
            return true;
        } else {
            System.err.print("Nhap sai diem trung binh!");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            System.err.print("Nhap lai dia chi email!");
            return false;
        }
    }

    @Override
    public void inputInfo() {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so bao danh: ");
        while (!setRollNo(input.nextLine()));

        System.out.print("Nhap diem: ");
        while (!setAvgMark(input.nextFloat()));

        System.out.print("Nhap email: ");
        while (!setEmail(input.nextLine()));
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", avgMark=" + avgMark + ", email=" + email + '}';
    }

    @Override
    public void showInfo() {
        super.showInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.print(toString());
        System.out.println(" ");
    }

    public boolean checkMark() {
        if (avgMark >= 8.0) {
            return true;
        } else {
            return false;
        }
    }
}
