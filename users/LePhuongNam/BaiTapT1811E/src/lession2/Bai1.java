/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession2;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Bai1 {
    public static void main(String[] args) {
//        Bài 1: Giải phương trình bậc nhất ax + b = 0;
        float a,b,x;
        
        System.out.println("Giai phuong trinh bac nhat ax + b = 0");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao tham so 'a' : ");
        a = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap vao tham so 'b' : ");
        b = Float.parseFloat(scanner.nextLine());
        
        if (a != 0) {
            x = -b / a;
            System.out.println("Nghiem cua phuong trinh la x = " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
