/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT43;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai10 {
    public static int snt(int x) {
        if (x <2) return -1;
        else {
            for (int i =2; i <x; i++) {
                if (x %i == 0) return -1;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.printf("Nhap n: ");
        n = Integer.parseInt(input.nextLine());
        
        if (snt(n) == -1) System.out.printf("n ko phai so nguyen to\n");
        else if (snt(n) == 1) System.out.printf("n la so nguyen to\n");
    }
}
