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
public class PhanBonBai39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so max:");
        int n = sc.nextInt();
        int f0=1, f1=1, fn=0;
     
            while(fn < n){
                System.out.printf("%d ", fn);
                if(fn<2){
                    System.out.printf("%d ", f0);
                    System.out.printf("%d ", f1);
                }
                fn=f0+f1;
                f0=f1;
                f1=fn;
            }

    }
}
