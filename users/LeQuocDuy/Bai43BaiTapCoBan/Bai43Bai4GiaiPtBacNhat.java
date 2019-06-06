/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai43BaiTapCoBan;

import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class Bai43Bai4GiaiPtBacNhat {
    public static void main(String[] args){
        System.out.println("GIAI PHUONG TRINH BAC NHAT ax + b = 0");
        
        Scanner in = new Scanner(System.in);
        int a,b;
        float x;
        
        System.out.print("- Nhap a: ");
        a = in.nextInt();
        System.out.print("- Nhap b: ");
        b = in.nextInt();
        
        System.out.printf("Phuong trinh co dang %dx + %d = 0\n",a,b);
        
        if((a==0)&&(b==0)){
            System.out.println("Phuong trinh co vo so nghiem");
        }
        else if((b==0)&&(a!=0)){
            System.out.println("Phuong trinh co nghiem x = 0");
        }
        else if((b!=0)&&(a==0)){
            System.out.println("Phuong trinh khong ton tai");
        }
        else if((a!=0)&&(b!=0)){
            x = (-b)/a;
            System.out.println("Phuong trinh co 1 nghiem duy nhat: " + x);
        }
           
    }
}
