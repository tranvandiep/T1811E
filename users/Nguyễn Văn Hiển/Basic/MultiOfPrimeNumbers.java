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

public class MultiOfPrimeNumbers {
    
    public static int fillNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so can phan tich: ");
        int a = input.nextInt();
        if(a <= 1) {
            System.out.println("Khong duoc nhap so nho hon 2");
            return fillNumber();
        } else {
            return a;
        }
    }
    public static void multiOfPrimeNumbers(int a) {
        int count;
        int i;
        int u;
        int b;
        for(i = 2; i <= a; i++) {
            int c = a;
            for(u = 1, count = 0; u <= i; u++) {
                if(i%u == 0) {
                    count++;
                }
            }
            if(count == 2) {
                int flag = 1;
                while(c%i == 0 && c/i > 1) {
                    b = c/i;
                    System.out.print(i);
                    flag++;
                    printMultiply(flag-1);
                    c = c - b;
                }
            }
        }
    }
    
    public static void printMultiply(int flag) {
        for(int i = 0; i < flag; i++) {
            System.out.print(".");
        }
    }
    
    public static void main(String[] args) {
        int a = fillNumber();
        System.out.print(a + " = ");
        multiOfPrimeNumbers(a);
    }
}
