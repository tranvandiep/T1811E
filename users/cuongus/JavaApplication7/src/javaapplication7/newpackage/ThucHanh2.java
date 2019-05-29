/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7.newpackage;

import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class ThucHanh2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc cua mang: ");
        n = Integer.parseInt(input.nextLine());
        
        int[] t = new int[n];
        
        System.out.println("Nhap vao phan tu cua mang: ");
        for (int i = 0; i < t.length; i++){
            t[i] = Integer.parseInt(input.nextLine());
        }
        
        int sum = 0;
        for (int i=0; i < t.length; i++){
            sum += t[i];
        }
        System.out.println("Tong cac gia tri cua mang: " + sum);
        
        int sum2 = 0, sodu;
        for (int i = 0; i<t.length; i++){
            if( t[i] % 3 == 0){
                sum2 += t[i];
            }
        }
        System.out.println("Tong cac so chia het cho 3: " + sum2);
    }
}
