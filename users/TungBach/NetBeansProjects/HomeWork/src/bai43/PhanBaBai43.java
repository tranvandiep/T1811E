/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai43;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanBaBai43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("nhap so a: ");
        a = sc.nextInt();
        System.out.println("nhap so b: ");
        b = sc.nextInt();
        System.out.println("nhap so c: ");
        c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a la so lon nhat");
            }else{
                System.out.println("c la so lon nhat");
            }
        }else{
            if(b>c){
                System.out.println("b la so lon nhat");
            }else{
                System.out.println("c la so lon nhat");
            }
        }
    }
}
