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

public class CountPrimeNumber {
    
    public static int fillNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong so nguyen to can in: ");
        int a = input.nextInt();
        if(a < 1) {
            System.out.println("So luong toi thieu la 1");
            return fillNumber();
        } else {
            return a;
        }
    }
    
    public static void countPrimeNumber(int a) {
        int count;
        int i;
        int u;
        int flag;
        
        for(i = 1, flag = 0; i >= 1; i++) {
            for(u = 1, count = 0; u <= i; u++) {
                if(i%u == 0) {
                    count++;
                }
            }
            if(count == 2) {
                flag++;
                System.out.print(i + " ");
                if(flag >= a) {
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int a = fillNumber();
        System.out.println(a + " so nguyen to can in ra la:");
        countPrimeNumber(a);
    }
    
}
