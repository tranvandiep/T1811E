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

public class PerfectNumberToN {
    public static int fillNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap gioi han cua day so: ");
        int a = input.nextInt();
        return a;
    }
    public static void perfectNumberToN(int a) {
        for(int i = 2; i <= a; i++) {
            int Sum = 0;
            for(int j = 1; j < i; j++) {
                if(i%j == 0) {
                    Sum = Sum + j;
                }
            }
            if(Sum == i) {
                System.out.printf("%d ", Sum);
            }
        }
    }
    
    public static void main(String[] args) {
        int a = fillNumber();
        System.out.printf("Day so hoan hao den %d la: ", a);
        perfectNumberToN(a);
    }
}
