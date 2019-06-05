/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT39;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BT39 {
    public static void main(String[] args) {
        Scanner MangSoNguyen = new Scanner(System.in);
        int Mang;
        int tong=0;
        
        System.out.println("Nhap mang so nguyen");
        for(int i=1; i <= 10;i++) {
            Mang = Integer.parseInt(MangSoNguyen.nextLine());
            
            tong += Mang;
        }
         System.out.println("tong = " + tong);
    } 
}
