/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class TestZoo {

    public static void main(String[] args) {
        int choose;
        Scanner input = new Scanner(System.in);
        Zoo zoo = new Zoo();
        Chuong chuong = new Chuong();
        Animal animal = new Animal();

        do {
            showMenu();
            System.out.print("Chon: ");
            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    zoo.themChuong();
                    break;
                case 2:
                    zoo.xoaChuong();
                    break;
                case 3:
                    chuong.themConVat();
                    break;
                case 4:
                    chuong.xoaConVat();
                    break;
                case 5:
                    animal.xemThongTin();
                    break;
                case 6:
                    System.out.print("Goodbye!");
                    break;
                default:
                    System.err.print("Nhap sai.");
                    break;
            }
        } while (choose != 6);
    }

    static void showMenu() {
        System.out.print("1. Them Chuong.");
        System.out.print("2. Xoa Chuong.");
        System.out.print("3. Them Con Vat.");
        System.out.print("4. Xoa Con Vat.");
        System.out.print("5. Xem Tat Ca Con Vat.");
        System.out.print("6. Thoat.");
    }
}
