/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class StudentTest {

    public static void main(String[] args) {
        int choose;
        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        do {
            showMenu();
            System.out.print("Lua chon: ");
            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    int n = Integer.parseInt(input.nextLine());

                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        std.inputInfo();

                        studentList.add(std);
                    }
                    break;
                case 2:
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfo();
                    }
                    break;
                case 3:
                    int minCache = 0,
                     maxCache = 0;
                    float minMark,
                     maxMark;
                    minMark = studentList.get(0).getAvgMark();
                    maxMark = studentList.get(0).getAvgMark();

                    for (int i = 1; i < studentList.size(); i++) {
                        if (studentList.get(i).getAvgMark() < minMark) {
                            minCache = i;
                            minMark = studentList.get(i).getAvgMark();
                        }

                        if (studentList.get(i).getAvgMark() > maxMark) {
                            maxCache = i;
                            maxMark = studentList.get(i).getAvgMark();
                        }
                    }

                    System.out.print("Sinh vien co diem cao nhat la:");
                    studentList.get(maxCache).showInfo();
                    System.out.print("Sinh vien co diem thap nhat la:");
                    studentList.get(minCache).showInfo();
                    break;
                case 4:
                    System.out.print("Nhap ma so sinh vien muon tim: ");
                    String noFind = input.nextLine();
                    int count = 0;

                    for (Student student : studentList) {
                        if (student.getRollNo().equalsIgnoreCase(noFind)) {
                            student.showInfo();
                            count++;
                        }
                    }

                    if (count == 0) {
                        System.out.print("Khong tim thay sinh vien nao!");
                    }
                    break;
                case 5:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            int cmp = o1.getName().compareTo(o2.getName());
                            if (cmp >= 0) {
                                return 1;
                            }
                            return -1;
                        }
                    });

                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfo();
                    }
                    break;
                case 6:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getAvgMark() >= o2.getAvgMark() ? -1 : 1;
                        }
                    });

                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).checkMark()) {
                            studentList.get(i).showInfo();
                        }
                    }
                    break;
                case 7:
                    System.out.print("Goodbye!");
                    break;
                default:
                    System.err.print("Nhap sai!");
                    break;
            }
        } while (choose != 7);
    }

    static void showMenu() {
        System.out.println("1. Nhap thong tin sinh vien.");
        System.out.println("2. Hien thi thong tin sinh vien.");
        System.out.println("3. Hien thi sinh vien co diem trung binh cao va thap nhat.");
        System.out.println("4. Tim sinh vien theo ma so.");
        System.out.println("5. Hien thi sinh vien theo bang chu cai.");
        System.out.println("6. Hien thi sinh vien co hoc bong va sap xep diem tu cao den thap.");
        System.out.println("7. Thoat.");
    }
}
