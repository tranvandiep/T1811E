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
public class Bai4 {

    public static void main(String[] args) {
        System.out.println("Cho phuong trinh: ax + b = 0");
        Scanner input = new Scanner(System.in);
        System.out.print("voi a bang: ");
        int a = input.nextInt();
        System.out.print("voi b bang: ");
        int b = input.nextInt();
        int x = 0;

        x = (0 - b) / a;
        System.out.printf("X = %d ", x);

    }
}
