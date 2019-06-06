/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT30;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai3 {
    static String ten;
    static int tuoi;
    static String diachi;
    static String email;
    static int  sdt;
    public static void main(String[] args) {
        System.out.println("Chuong trinh nhap thong tin sinh vien!");
        Scanner input = new Scanner(System.in);
        System.out.println("Moi ban nhap thong tin sinh vien.");
        System.out.println("Ten sinh vien: ");
        ten = input.nextLine();
        System.out.println("Tuoi: ");
        tuoi = Integer.parseInt(input.nextLine());
        System.out.println("Dia chi: ");
        diachi = input.nextLine();
        System.out.println("Email: ");
        email = input.nextLine();
        System.out.println("Sdt: ");
        sdt = Integer.parseInt(input.nextLine());
        System.out.println("Thong tin sinh vien vua nhap!");
        System.out.println("Ten sinh vien: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diachi);
        System.out.println("Email: " + email);
        System.out.println("Sdt: " + sdt);
    }
   
}
