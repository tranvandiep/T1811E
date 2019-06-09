/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai45;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanMotBai45 {
    public static void main(String[] args) {
        int a;
        String ten = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = sc.nextInt();
        
        switch(a){
            case 1:
                System.out.println("Nhap ten cua ban: ");
                ten = sc.next();
                break;
            case 2:
                System.out.println("Ten: " +ten);
                break;
            default:
                System.out.println("ket thuc chuong trinh");
                break;
        }
    }
}
