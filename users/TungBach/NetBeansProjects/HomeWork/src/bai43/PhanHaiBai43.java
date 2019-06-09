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
public class PhanHaiBai43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        double y;
        String z;
        String m;
        
        System.out.println("nhap int: ");
        x = sc.nextInt();
        System.out.println("nhap double:");
        y = sc.nextDouble();
        System.out.println("nhap string:");
        z = sc.nextLine();
        System.out.println("nhap String:");
        m = sc.nextLine();
        
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("z: "+z);
        System.out.println("m: "+m);
    }
}
