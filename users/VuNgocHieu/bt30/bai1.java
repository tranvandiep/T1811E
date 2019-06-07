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
public class bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        float a,b;
        System.out.println("Chuong trinh giai phuong trinh bac nhat ax + b = 0 ");
        System.out.println("nhap vao a va b: ");
        a = Float.parseFloat(input.nextLine());
        b = Float.parseFloat(input.nextLine());
        System.out.println("Tim duoc x sau khi nhap a va b, x = " + (-b/a));
    }
}
