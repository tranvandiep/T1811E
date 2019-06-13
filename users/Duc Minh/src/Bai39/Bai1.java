/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai39;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Bai1 {

    public static void main(String[] args) {

        int[] mang = new int[10];
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Nhap so thu %d:", i + 1);
            mang[i] = input.nextInt();
            sum += mang[i];
        }
        System.out.printf("Ket qua la: %d", sum);
    }
}
