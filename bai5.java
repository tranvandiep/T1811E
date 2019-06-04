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
public class bai5 {
 public static void main(String[] args){
     int n,i,j,tg;
     Scanner nhap= new Scanner(System.in);
     System.out.println("nhap vao n:");
     n=nhap.nextInt();
     int array[]= new int[n];
     System.out.println("nhap vao mang a");
     for (i=0;i<n;i++)
     {
         System.out.print("nhap vao phan tu "+i+" la: ");
         array[i]=nhap.nextInt();
     }
     for(i=0;i<n-1;i++){
         for (j=i+1;j<n;j++){
             if (array[i]>array[j]){
                 tg=array[i];
                 array[i]=array[j];
                 array[j]=tg;
             }
         }
 }   
     System.out.println("mang tang dan la:");
  for(i=0;i<n;i++)  
  {
      System.out.print(+array[i]+"  ");
  }
}
}
