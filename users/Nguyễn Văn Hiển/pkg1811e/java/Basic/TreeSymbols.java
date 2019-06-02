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
import java.lang.StringBuilder;

public class TreeSymbols {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int a = Integer.parseInt(input.nextLine());
        String[] Symbol = new String[a];
        
        for(int i = 0; i < a; i++) {
            System.out.print("Nhap phan tu thu " +i + " la: ");
            Symbol[i] = input.nextLine();
        }
        for(int i = 0; i < a; i++) {
            System.out.println(Symbol[i]);
        }
        System.out.printf("N = %d \n", a);
    }
}
