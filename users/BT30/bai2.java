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
public class bai2 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tim so chan so le!");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen bat ki:");
        long n = input.nextLong();
        if (n % 2 == 0 ) {
            System.out.println("So vua nhap la so chan!");
        }else {
            System.out.println("So vua nhap la so le!");
        }
    }
}
