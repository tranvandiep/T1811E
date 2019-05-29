/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.Basic;

/**
 *
 * @author PC
 */
import java.util.Scanner;
import java.lang.Math;

public class MultiDigritPrimeNumber {
    
    public static int fillNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so chu so cua so nguyen to can in: ");
        int a = input.nextInt();
        if(a < 1) {
            System.out.print("So chu so phai toi thieu la 1");
            return fillNumber();
        } else {
            return a;
        }
    }
    
    public static void multiDigritNumber(int a) {
        int i;
        int u;
        int count;
        int flag = 0;
        double x = Math.pow(10,a);
        
        for(i = 1; i <= x; i++) {
            for(u = 1, count = 0; u <= i; u++) {
                if(i%u == 0) {
                    count++;
                }
            }
            if(count == 2) {
                if(1 >= i/x && i/x > 0.1) {
                    flag++;
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Co tong cong " +flag + " so nguyen to");
    }
    
    public static void main(String[] args) {
        int a = fillNumber();
        System.out.println("Cac so nguyen to co " +a + " chu so la: ");
        multiDigritNumber(a);
    }
}
