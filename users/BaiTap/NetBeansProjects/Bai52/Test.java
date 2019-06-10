/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author giangduy
 */
public class Test {
    public static void main(String[] args) {
        int menu;
        Scanner input = new Scanner(System.in);
        ArrayList<AptechBook> bookList = new ArrayList<>();

        do {
            showMenu();
            menu = Integer.parseInt(input.nextLine());

            switch (menu) {
                case 1:
                    System.out.print("Nhap so luong sach: ");
                    int n = Integer.parseInt(input.nextLine());

                    for (int i = 0; i < n; i++) {
                        AptechBook atB = new AptechBook();
                        atB.input();

                        bookList.add(atB);
                    }

                    break;
                case 2:
                    for (int i = 0; i < bookList.size(); i++) {
                        bookList.get(i).display();
                    }
                    break;
                case 3:
                    Collections.sort(bookList, new Comparator<AptechBook>() {
                        @Override
                        public int compare(AptechBook o1, AptechBook o2) {
                            return o1.getYearPublishing() >= o2.getYearPublishing() ? 1 : -1;
                        }
                    });

                    for (int i = 0; i < bookList.size(); i++) {
                        bookList.get(i).display();
                    }
                    break;
                case 4:
                    System.out.print("Nhap ten sach can tim: ");
                    String bookFind = input.nextLine();

                    for (AptechBook atB : bookList) {
                        if (atB.getBookName().equalsIgnoreCase(bookFind)) {
                            atB.display();
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nhap ten tac gia can tim: ");
                    String authorFind = input.nextLine();

                    for (AptechBook atB: bookList) {
                        if (atB.getBookAuthor().equalsIgnoreCase(authorFind)) {
                            atB.display();
                        }
                    }
                    break;
                case 6:
                    System.out.print("Goodbye!");
                    break;
                default:
                    System.err.println("Nhap sai!!");
                    break;
            }
        } while (menu
                != 6);

    }

    static void showMenu() {
        System.out.println("1. Nhap thong tin sach.");
        System.out.println("2. Hien thi thong tin sach.");
        System.out.println("3. Sap xep giam dan theo nam san xuat va hien thi thong tin sach.");
        System.out.println("4. Tim kiem theo ten sach.");
        System.out.println("5. Tim kiem theo ten tac gia.");
        System.out.println("6. Thoat.");
    }
}
