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

public class SumOfFibonacciToN {
    
    public static int fillNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int a = input.nextInt();
        return a;
    }
    
    public static int calculate(int a) {
        int b = 0;
        int c = 1;
        int S = 1;
        for(int i = 0; c <= a; i++) {
            b = c;
            c = S;
            S = b + c;
        }
        return S;
    }
    
    public static void main(String[] args) {
         int a = fillNumber();
         int S = calculate(a);
         System.out.println("Tong day fibonacci tu 0 den so lon nhat truoc " +a + " la: " +S);
    }
}
