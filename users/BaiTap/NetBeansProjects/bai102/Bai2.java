/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai102;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author giangduy
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rdn = new Random();

        System.out.println("Nhap vao N so nguyen: ");
        int N = Integer.parseInt(input.nextLine());
        int[] n = new int[N];

        for (int i = 0; i < N; i++) {
            n[i] = rdn.nextInt();
            System.out.println(n[i]);
        }
    }
}
