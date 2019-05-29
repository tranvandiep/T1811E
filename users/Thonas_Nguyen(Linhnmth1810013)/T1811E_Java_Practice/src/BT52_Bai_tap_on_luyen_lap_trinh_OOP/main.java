/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT52_Bai_tap_on_luyen_lap_trinh_OOP;

import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class main {
    public static void main(String[] args) {
        Book book = new Book();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten sach:");
        book.setBookName(input.nextLine());
        System.out.println("Nhap tac gia:");
        book.setBookAuthor(input.nextLine());
        System.out.println("Nhap nha san xuat:");
        book.setProducer(input.nextLine());
        System.out.println("Nhap gia sach:");
        book.setPrice(Float.parseFloat(input.nextLine()));
        System.out.println("Nhap nam xuat ban:");
        book.setYearPublishing(Integer.parseInt(input.nextLine()));
    }
}
