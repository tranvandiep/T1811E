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
public class Bai3 {

    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap N:");
        N = input.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.printf("N = %d", N);
    }
}
