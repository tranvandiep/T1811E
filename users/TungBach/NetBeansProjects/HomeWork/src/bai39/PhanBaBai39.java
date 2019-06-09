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
public class PhanBaBai39 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n:");
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
              System.out.print("*");  
            }     
            System.out.println();
        }
        System.out.printf("n = %d", n);
    }
}
