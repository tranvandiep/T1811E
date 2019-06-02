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

public class PrimeNumber {
    
    public static int fillNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int a = input.nextInt();
        if(a > 1) {
            return a;
        } else {
            System.out.println("Khong duoc nhap so am hoac < 2");
            return fillNumber();
        }
    }
    
    public static void primeNumber(int a) {
        int count;
        int u;
        int i;
        int flag = 0;
        for(i = 1; i <= a; i++) {
            for(count = 0, u = 1; u <= i; u++) {
                if(i%u == 0) {
                    count++;
                }
            }
            if(count == 2) {
                System.out.print(i + " ");
                flag++;
            }
        }
        System.out.println();
        System.out.println("Co tong cong " +flag + " so ");
    }
    
    public static void main(String[] args) {
        int a = fillNumber();
        System.out.println("Cac so nguyen to nho hon " +a + " la: ");
        primeNumber(a);
        System.out.println();
    }
    
}
