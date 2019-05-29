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

public class PerfectNumber {
    public static int fillNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int a = input.nextInt();
        if(a <= 0) {
            System.out.println("So kiem tra phai la so nguyen duong");
            return fillNumber();
        } else {
            return a;
        }
    }
    public static void checkPerfectNumber(int a) {
        int Sum = 0;
        for(int i = 1; i < a; i++) {
            if(a%i == 0) {
                Sum = Sum + i;
            }
        }
        if(Sum == a) {
            System.out.println(a + " la so hoan hao");
        } else {
            System.out.println(a + " khong la so hoan hao");
        }
    }
    
    public static void  main(String[] args) {
        int a = fillNumber();
        checkPerfectNumber(a);
    }
}
