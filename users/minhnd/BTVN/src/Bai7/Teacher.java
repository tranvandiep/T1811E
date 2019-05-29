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
public class Teacher extends Person {

    String classNo;
    int salaryPHour;
    int classHours;
    int totalSalary;

    public Teacher() {
    }

    public Teacher(String classNo, int salaryPHour, int classHours) {
        this.classNo = classNo;
        this.salaryPHour = salaryPHour;
        this.classHours = classHours;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public int getSalaryPHour() {
        return salaryPHour;
    }

    public void setSalaryPHour(int salaryPHour) {
        this.salaryPHour = salaryPHour;
    }

    public int getClassHours() {
        return classHours;
    }

    public void setClassHours(int classHours) {
        this.classHours = classHours;
    }

    @Override
    public void inputInfo() {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap ten lop: ");
        classNo = input.nextLine();
        System.out.print("Nhap luong mot gio: ");
        salaryPHour = input.nextInt();
        System.out.print("Nhap tong so gio day: ");
        classHours = input.nextInt();
    }

    @Override
    public void showInfo() {
        super.showInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "Teacher{" + "classNo=" + classNo + ", salaryPHour=" + salaryPHour + ", classHours=" + classHours + '}';
    }

    public void salary() {

        if (classNo.contains("G") && classNo.contains("H") && classNo.contains("I") && classNo.contains("K")) {
            totalSalary = salaryPHour * classHours;
        }

        if (classNo.contains("L") && classNo.contains("M")) {
            totalSalary = salaryPHour * classHours + 200000;
        }

    }

}
