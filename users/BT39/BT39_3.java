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
public class BT39_3 {
    public static void main(String[] args) {
        Scanner dong = new Scanner(System.in);
        int n,i,j;
        System.out.println("nhap so dong muon in: ");
        n = dong.nextInt();
        for(i=1;i<=n;i++) {
            for(j=1;j<=i;j++) 
                System.out.printf("*"); 
                System.out.printf("\n"); 
        }
    }
}
