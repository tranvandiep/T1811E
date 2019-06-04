/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai1 {
     public static void main(String[] args) {
         int n;int i;int sum = 0;
         Scanner nhap = new Scanner(System.in);
         System.out.println("Nhap vao so phan tu mang: ");
         n=nhap.nextInt();
         int array[]= new int[n];
         System.out.println("nhap cac phan tu mang:");
         for(i=0;i<n;i++)
         {
             System.out.print("phan tu thu "+i+ ":");
             array[i]=nhap.nextInt();
         }    
         
         for(i=0;i<n;i++)
         {
             sum=sum+array[i];
         }
         System.out.println("tong cac phan tu mang:"+sum);
         }
    
}
