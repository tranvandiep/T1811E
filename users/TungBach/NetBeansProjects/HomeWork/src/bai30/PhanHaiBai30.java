/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai30;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanHaiBai30 {
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("nhap so a:");
        x = scan.nextInt();
        if(x % 2 == 0){
            System.out.println("x la so chan");
        }else{
            System.out.println("x la so le");
        }
    }
}
