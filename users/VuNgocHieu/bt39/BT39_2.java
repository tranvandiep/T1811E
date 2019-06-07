/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT39;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT39_2 {
    public static void main(String[] args) {
        Scanner sophantu = new Scanner(System.in);
        int n,tong = 0;    
        int[] Mang = new int[100];
        System.out.println("Nhap so phan tu: ");
        n = sophantu.nextInt();
        Scanner phantu = new Scanner(System.in);        
        System.out.println("nhap so nguyen tu: ");
        for (int i=1; i <= n; i++) {
            Mang[i] = phantu.nextInt(); 
            if(Mang[i] % 3 == 0) {
            tong = tong + Mang[i];
        }
        }
        System.out.println("tong chia het cho 3 la: " + tong);
    }
}
