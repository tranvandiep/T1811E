/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai43;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap mot so:");
        int a = input.nextInt();
        System.out.println("Nhap mot so double:");
        double b = input.nextDouble();
        System.out.println("Nhap mot chu:");
        String c = input.nextLine();
        System.out.println("Nhap mot chuoi:");
        String d = input.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
