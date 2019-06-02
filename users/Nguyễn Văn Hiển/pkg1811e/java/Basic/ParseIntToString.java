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

public class ParseIntToString {
    public static int fillNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so can chuyen doi: ");
        int a = input.nextInt();
        return a;
    }
    public static String parseNumber(int number) {
        String s = String.valueOf(number);
        return s;
    }
    public static void displayString(String s) {
        System.out.printf("Chuoi tuong ung la: %s \n", s);
    }
    
    public static void main(String[] args) {
        int a = fillNumber();
        displayString(parseNumber(a));
    }
}
