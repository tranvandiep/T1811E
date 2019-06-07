/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT39;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BT39Bai1 {
    public static void main(String[] args) {
        Scanner MangSoNguyen = new Scanner(System.in);
        int tong =0;
        int[] so = new int[100];
        
        for (int i =0; i <10; i++) {
            System.out.printf("Nhap so nguyen thu %d trong day: ", i +1);
            so[i] = Integer.parseInt(MangSoNguyen.nextLine());
        }
        
        for (int i =0; i <10; i++) {
            tong += so[i];
        }
        
        System.out.printf("Tong cua day so la: %d\n", tong);
    }
}
