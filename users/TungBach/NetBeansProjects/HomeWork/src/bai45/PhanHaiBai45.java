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
public class PhanHaiBai45 {
    
    public static int tongHaiSo(int x, int y){
        int tong = x + y;
        return tong;
    }
    
    public static int hieuHaiSo(int x, int y){
        int hieu = x - y;
        return hieu;
    }
    
    public static int tichHaiSo(int x, int y){
        int tich = x * y;
        return tich;
    }
    
    public static int thuongHaiSo(int x, int y){
        int thuong = x / y;
        return thuong;
    }
    
    public static void main(String[] args) {
        int x;
        int y;
        int selection ;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so x: ");
        x = sc.nextInt();
        System.out.println("Nhap so y: ");
        y = sc.nextInt();
        System.out.println("Vui long lua chon: ");
        selection = Integer.parseInt(sc.nextLine());
        switch(selection){
            case 1:    
                System.out.println("2 so vua nhap:");
                System.out.println(x);
                System.out.println(y);
                break;
            case 2:
                int tong = tongHaiSo(x, y);
                System.out.println("Tong 2 so:");
                System.out.println(tong);
                break;
            case 3:
                int hieu = hieuHaiSo(x, y);
                System.out.println("Hieu 2 so:");
                System.out.println(hieu);
                break;
            case 4:
                int tich = tichHaiSo(x, y);
                System.out.println("Tich 2 so:");
                System.out.println(tich);
                break;
            case 5:
                int thuong = thuongHaiSo(x, y);
                System.out.println("Thuong 2 so:");
                System.out.println(thuong);
                break;
            default:
                System.out.println("ket thuc chuong trinh");
                break;
        }
    }
}
