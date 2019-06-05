/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession3;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Bai3 {

    public static void main(String[] args) {
        System.out.println("Bài 3 :\n"
                + "\n"
                + "In ra hình sau\n"
                + "\n"
                + "*\n"
                + "\n"
                + "**\n"
                + "\n"
                + "***\n"
                + "\n"
                + "****\n"
                + "\n"
                + "*****\n"
                + "\n"
                + "N = 5\n"
                + "\n"
                + "Yêu cầu : Nhập N từ bàn phím, và in ra cây như hình trên");
        
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan dong muon in ra dau '*' !");
        n = Integer.parseInt(scanner.nextLine());
        while (n < 1) {            
            System.out.println("So dong khong duoc nho hon 0! Nhap lai : ");
            n = Integer.parseInt(scanner.nextLine());
        }
        
        for (int i = 0; i < n+1; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
