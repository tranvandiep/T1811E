/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai39;

import java.util.Scanner;






/**
 *
 * @author Admin
 */
public class PhanHaiBai39 {
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu trong mang:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int tong = 0;
        
        System.out.println("Nhap phan tu cua mang:");
        for(int i=0; i<n; i++){
            System.out.format("a[%d] = ",i);
            arr[i] = sc.nextInt();
            if(arr[i] % 3 == 0){
                tong += arr[i];
            }
        }
        System.out.println("ket qua: " + tong);
    }
}

