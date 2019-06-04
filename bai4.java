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
public class bai4 {
    public static void main(String[] args){
    int n,i,dem = 0;
    Scanner nhap= new Scanner(System.in);
        System.out.println("nhap vao gia tri max");
    n=nhap.nextInt();
    int f1,f2,f3;
    f1=1;
    f2=1;
    while (f1<n)
    {
        System.out.print(" "+f1);
        f3=f1+f2;
        f1=f2;
        f2=f3;
    }
    }
}
