/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT30;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class chanLe {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String [] args ) {
        long x;
        
        System.out.printf("Nhap so x: ");
        x = Long.parseLong(input.nextLine());
    
        if (x %2 == 0) System.out.printf("x la so chan\n");
        else System.out.printf("x la so le\n");
    }
}    
