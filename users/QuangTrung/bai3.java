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
public class bai3 {
    public static void main(String[] args){
    int n,i,j;
    Scanner nhap =new Scanner(System.in);
    System.out.println("nhap vao gia tri N:");
    n=nhap.nextInt();
    for(i=0;i<n;i++)
    {
        for(j=0;j<i;j++)
        {
        System.out.print("*");
        }
        System.out.print("\n");
    }
    
}
}
