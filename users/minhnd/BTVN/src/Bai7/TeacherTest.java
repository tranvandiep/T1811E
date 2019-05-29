/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class TeacherTest {

    public static void main(String[] args) {
        int choose;
        ArrayList<Teacher> teacherList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    System.out.print("Nhap so luong giao vien: ");
                    int n = Integer.parseInt(input.nextLine());

                    for (int i = 0; i < n; i++) {
                        Teacher tcr = new Teacher();
                        tcr.inputInfo();

                        teacherList.add(tcr);
                    }
                    break;
                case 2:
                    for (int i = 0; i < teacherList.size(); i++) {
                        teacherList.get(i).showInfo();
                    }
                    break;
                case 3:
                    int maxCache = 0;
                    float maxSalary;
                    maxSalary = teacherList.get(0).totalSalary;

                    for (int i = 1; i < teacherList.size(); i++) {
                        if (teacherList.get(i).totalSalary > maxSalary) {
                            maxCache = i;
                            maxSalary = teacherList.get(i).totalSalary;
                        }
                    }
                    
                    System.out.print("Giao vien co luong cao nhat la: ");
                    teacherList.get(maxCache).showInfo();
                    break;
                case 4:
                    System.out.print("Goodbye!");
                    break;
            }
        } while (choose != 4);

    }

    static void showMenu() {
        System.out.println("1. Nhap so luong giang vien.");
        System.out.println("2. Hien thi thong tin giang vien.");
        System.out.println("3. Giang vien co luong cao nhat la: ");
        System.out.println("4. Thoat.");
    }
}
