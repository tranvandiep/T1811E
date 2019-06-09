/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai43;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanNamBai43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        float b;
        float c;
        System.out.println("Nhap he so a:");
        a = sc.nextFloat();
        System.out.println("Nhap he so b:");
        b = sc.nextFloat();
        System.out.println("Nhap he so c:");
        c = sc.nextFloat();
        
        if(a == 0){
            if(b == 0){
                System.out.println("Pt vo nghiem");
            }else{
                System.out.println("Pt co 1 nghiem duy nhat: " + "x = "+ (-c/b));
            }
        }
        
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Pt co 2 nghiem: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Pt co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Pt vo nghiem");
        }
    }
}
