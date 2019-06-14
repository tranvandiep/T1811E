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

public class HigherOrLower {
    
    public static int fillNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int value = input.nextInt();
        return value;
    }
    public static void compare(int a, int b, int c) {
        int[] arr = {a, b, c};
        int element;
        for(int j = 0; j < 3; j++) {
            for(int i = 2; i >= 1; i--) {
                if(arr[i] < arr[i-1]) {
                    element = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = element;
                }
            }
        }
        for(int i = 0; i < 3; i++) {
            if(i == 0) {
                System.out.printf("So nho nhat la: %d\n", arr[0]);
            }
            if(i == 2) {
                System.out.printf("So lon nhat la: %d\n", arr[2]);
            }
        }
    }
    
    public static void main(String[] args) {
        int a = fillNumber();
        int b = fillNumber();
        int c = fillNumber();
        compare(a, b, c);
        
    }
}
