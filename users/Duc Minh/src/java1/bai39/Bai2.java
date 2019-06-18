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
public class Bai2 {

    public static void main(String[] args) {

        int N;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu:");
        N = input.nextInt();

        int[] mang = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("Nhap so thu %d:", i + 1);
            mang[i] = input.nextInt();
            if (mang[i] % 3 == 0) {
                sum += mang[i];
            }
        }
        System.out.printf("Ket qua la: %d", sum);
    }
}
