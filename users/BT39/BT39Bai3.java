/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT39;
import java.util.Scanner;

public class BT39Bai3 {
    public static void main(String[] args) {
        Scanner MangSoNguyen = new Scanner(System.in);
        
        int n;
        int [] so = new int[100];
        
        System.out.printf("Nhap so phan tu cua mang: ");
        n = Integer.parseInt(MangSoNguyen.nextLine());
        
        for (int i =0; i <n; i++) {
            for (int j =0; j <=i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
