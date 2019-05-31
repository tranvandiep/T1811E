/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.mark;

import Bai56.StudentAptech;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Manager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        List<StudentAptech> studentAptechList = new ArrayList<>();
        List<StudentMarkTotal> studentMTList = new ArrayList<>();

        do {
            showMenu();
            System.out.print("Choose: ");
            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    System.out.print("Input the nummber of Student: ");
                    int n = Integer.parseInt(input.nextLine());

                    for (int i = 0; i < n; i++) {
                        StudentAptech studentAptech = new StudentAptech();
                        studentAptech.input();

                        studentAptechList.add(studentAptech);
                    }

                    break;
                case 2:
                    System.out.print("Input the nummber of exam: ");
                    int m = Integer.parseInt(input.nextLine());

                    for (int i = 0; i < m; i++) {
                        StudentMarkTotal smt = new StudentMarkTotal();
                        smt.input();

                        studentMTList.add(smt);
                    }

                    break;
                case 3:
                    Collections.sort(studentAptechList, new Comparator<StudentAptech>() {
                        @Override
                        public int compare(StudentAptech o1, StudentAptech o2) {
                            int cmp = o1.getStuName().compareTo(o2.getStuName());
                            if (cmp >= 0) {
                                return 1;
                            }
                            return -1;

                        }
                    }
                    );

                    for (StudentAptech stdA : studentAptechList) {
                        stdA.dishplay();
                    }

                    break;
                case 4:
                    System.out.print("Input Student'ID: ");
                    String IDFind = input.nextLine();

                    for (StudentAptech stdA : studentAptechList) {
                        if (stdA.getStuId().equalsIgnoreCase(IDFind)) {
                            for (StudentMarkTotal smtList : studentMTList) {
                                smtList.dishplay();
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.print("Goodbye!");
                    break;
                default:
                    System.err.print("Wrong choose!");
                    break;
            }

        } while (choose != 5);

    }

    static void showMenu() {
        System.out.print("1. Input Aptech's Student Information.");
        System.out.print("2. Input marks for students above.");
        System.out.print("3. Sort by student's name.");
        System.out.print("4. Find student by ID.");
        System.out.print("5. Exit.");
    }
}
