/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class hinhtron {
    double r;
    
    public double pi () {
        return Math.PI;
    }
    
    public void nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        r = nhap.nextDouble();
    }
    
    public double chuVi() {
        return 2 * pi() * r;
    }
    
    public double dienTich() {
        return (double) r * r * pi();
    }        
    
    public void xuat () {
        System.out.println("Chu vi cua hinh tron la: " + chuVi());
        System.out.println("Dien tich hinh tron la: " + dienTich());
    }
}
