/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Student {

    String rollNo;
    String name;
    String sex;
    int age;
    String email;
    String address;

    public Student() {
    }

    public Student(String rollNo, String name, String sex, int age, String email, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name=" + name + ", sex=" + sex + ", age=" + age + ", email=" + email + ", address=" + address + '}';
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so bao danh: ");
        rollNo = input.nextLine();

        System.out.println("Nhap ten sinh vien: ");
        name = input.nextLine();

        System.out.println("Nhap gioi tinh: ");
        sex = input.nextLine();

        System.out.println("Nhap so tuoi: ");
        age = Integer.parseInt(input.nextLine());

        System.out.println("Nhap email: ");
        email = input.nextLine();

        System.out.println("Nhap dia chi: ");
        address = input.nextLine();
    }

    public void display() {
        System.out.println(toString());
    }

    public static void main(String[] args) {
        int choose;
        Scanner input = new Scanner(System.in);
        List<Student> stdList = new ArrayList<>();
        HashMap<String, Student> studentMap = new HashMap<>();

        do {
            showMenu();
            System.out.println("Choose: ");
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhap so luong sinh vien: ");
                    int n = Integer.parseInt(input.nextLine());

                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        std.input();

                        stdList.add(std);
                        studentMap.put(std.getRollNo(), std);
                    }
                    break;
                case 2:
                    stdList.forEach((shortList) -> {
                        shortList.display();
                    });
                    break;
                case 3:
                    System.out.println("Nhap so bao danh can tim: ");
                    String find = input.nextLine();

                    Student stdFind = studentMap.get(find);
                    stdFind.display();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.err.println("Nhap sai!");
                    break;
            }
        } while (choose != 4);
    }

    static void showMenu() {
        System.out.println("1. Nhap N sinh vien.");
        System.out.println("2. In thong tin sinh vien.");
        System.out.println("3. Tim thong tin sinh vien bang rollNo.");
        System.out.println("4. Thoat.");
    }
}
