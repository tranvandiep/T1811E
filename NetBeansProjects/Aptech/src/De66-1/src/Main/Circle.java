/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Circle {
    public int bk;
    
    public void input(){
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap ban kinh: ");
        bk = Integer.parseInt(input.nextLine());
        
    }
    
    public void chuvi(){
        double x;
        x = bk * 2* 3.14;
        System.out.printf("Chu vi hinh tron la: %f", x);
    }
    
    public void dientich(){
        double y;
        y = bk * bk * 3.14;
        System.out.printf("Dien tich hinh tron la: %f",y);
    }
}
