/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai30;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanMotBai30 {
    public static void main(String[] args) {
        int a , b;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        
        //neu a==0 va b==0 thi pt vo so nghiem
        //neu a=0 va b!=0 thi pt vo nghiem
        //neu a!=0 thi pt co 1 nghiem duy nhat la x= -b/a
        if(a==0){
            if(b==0){
                System.out.println("pt vo so nghiem");
            }else{
                System.out.println("pt vo nghiem");
            }
        }else{
            float x = (float) -b/a;
            System.out.println("Pt co 1 nghiem duy nhat x =" + x);
        }
    }
}
