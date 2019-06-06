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
public class Bai43Bai2NhapInBien {
    public static void main(String[] args){
        int a;
        double b;
        char c;
        String d;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap gia tri cho so nguyen a: ");
        a = input.nextInt();
        
        System.out.println("Nhap gia tri cho so thuc b: ");
        b = input.nextDouble();
        
        System.out.println("Nhap gia tri cho ky tu c: ");
        c = input.next().charAt(0);
        
        input.nextLine();
        System.out.println("Nhap gia tri cho chuoi d: ");
        d = input.nextLine();
        
        System.out.println("\nCac gia tri vua nhap vao la: ");
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
    }
}
