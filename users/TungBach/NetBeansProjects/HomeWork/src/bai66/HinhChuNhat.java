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
public class HinhChuNhat {
    float width;
    float height;
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        width = scan.nextFloat();
        System.out.println("Nhap chieu rong: ");
        height = scan.nextFloat();
    }
    
    public float tinhDienTich(){
        return width * height;
    }
    
    public float tinhChuVi(){
        return 2 * (width + height);
    }
}
