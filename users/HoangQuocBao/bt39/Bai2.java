/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt39;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int[] so = new int[100]; // int so[100];
        int tong =0;
        
        System.out.printf("Nhap so phan tu trong mang: ");
        n = input.nextInt();
        for (int i =0; i <n; i++) {
            System.out.printf("Nhap so nguyen thu %d trong day: ", i +1);
            so[i] = input.nextInt();
        }
        
        for (int i =0; i <n; i++) {
            if (so[i] %3 ==0) {
                tong += so[i];
            }
        }
        
        System.out.printf("Tong cac so chia het cho 3 trong mang la %d\n", tong);
    }
}
