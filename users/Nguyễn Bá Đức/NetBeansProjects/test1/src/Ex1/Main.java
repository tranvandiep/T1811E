/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class Main {

    public static void main(String[] args) {
        int a, b, x;
        Scanner nhap = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Nhap vao so thu nhat: ");
        a = nhap.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        b = nhap.nextInt();
        System.out.println("Phuong trinh vua nhap la: " + a + "x +" + b + " = 0");
        
        if (a == 0) {
            if(b==0) {
                System.out.println("Phuong trinh co vo so nghiem!");
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }else {
                    x = (-b / a);
                    System.out.println("Phuong trinh co nghiem : " + decimalFormat.format(x));
                    }
    }

}
