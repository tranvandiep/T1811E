/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai66;

import java.util.Scanner;

/**
 *
 * @author giangduy
 */
public class Main {
    public static void main(String[] args) {
        int choose;
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        do {
            showMenu();
            System.out.print("Choose: ");
            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    circle.input();
                    break;
                case 2:
                    System.out.println("Chu vi hinh tron la: " + circle.tinhChuVi());
                    break;
                case 3:
                    System.out.println("Dien tich hinh tron la: " + circle.tinhDienTich());
                    break;
                case 4:
                    rectangle.input();
                    break;
                case 5:
                    System.out.println("Chu vi hinh chu nhat la: " + rectangle.tinhChuVi());
                    break;
                case 6:
                    System.out.println("Dien tich hinh chu nhat la: " + rectangle.tinhDienTich());
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
        System.out.println("1. Nhap thong tin hinh tron.");
        System.out.println("2. Tinh chu vi hinh tron.");
        System.out.println("3. Tinh dien tich hinh tron.");
        System.out.println("4. Nhap thong tin hinh chu nhat.");
        System.out.println("5. Tinh chu vi hinh chu nhat.");
        System.out.println("6. Tinh dien tich hinh chu nhat.");
        System.out.println("7. Thoat.");
    }
}
