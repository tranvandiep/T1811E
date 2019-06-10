/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai66;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Circle {
    float radius;
    
    public double getPI(){
        return Math.PI;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        radius = input.nextFloat();
    }
    
    public float tinhChuVi(){ 
        return (float) (2* getPI() * radius);
    }
    
    public float tinhDienTich(){
        return (float) (getPI() * Math.pow(radius, 2));
    }
}
