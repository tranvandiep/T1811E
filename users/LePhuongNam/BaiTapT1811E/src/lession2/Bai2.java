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
public class Bai2 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bài 2 : Nhập số nguyên x, in ra x là số chẵn hay số lẻ");
        System.out.println("Nhap vao so nguyen x : ");
        x = Integer.parseInt(scanner.nextLine());
        
        if (x % 2 == 1) {
            System.out.printf("%d la so le", x);
        } else {
            System.out.printf("%d la so chan", x);
        }
    }
}
