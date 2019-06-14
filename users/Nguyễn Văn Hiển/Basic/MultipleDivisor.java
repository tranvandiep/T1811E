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

public class MultipleDivisor {
    
    public static int fillNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int a = input.nextInt();
        return a;
    }
    
    public static void devisor(int a, int b) {
        while(a != b) {
            if(a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("Uoc chung lon nhat cua la: " +a);
    }
    
    public static void multiple(int st1, int st2) {
        int a = st1;
        int b = st2;
        int c;
        while(a != b) {
            if(a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        c = (st1*st2)/a;
        System.out.println("Boi chung nho nhat la: " +c);
    }
    
    public static void main(String[] args) {
        int a = fillNumber();
        int b = fillNumber();
        devisor(a, b);
        multiple(a, b);
    }
    
}
