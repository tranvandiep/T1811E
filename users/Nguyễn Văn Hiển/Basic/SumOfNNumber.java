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

public class SumOfNNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int a = input.nextInt();
        int[] Integer = new int[a];
        int S = 0;
        for(int i = 0; i < a; i++) {
            System.out.printf("Phan tu thu %d la: ", i);
            Integer[i] = input.nextInt();
            if(Integer[i]%3 == 0) {
                S = S + Integer[i];
            }
        }
        System.out.printf("Tong cac so chia het cho 3 la: S = %d \n", S);
    }
}
