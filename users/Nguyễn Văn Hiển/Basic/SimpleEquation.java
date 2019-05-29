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

public class SimpleEquation {
    
    public static void fillFactor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap he so thu 1: ");
        double a = input.nextDouble();
        System.out.print("Nhap he so thu 2: ");
        double b = input.nextDouble();
        calculation(a, b);
    }
    public static void calculation(double a, double b) {
        double root = -b/a;
        System.out.println("x = " + root);
    }
    public static void main(String[] args) {
        fillFactor();
    }
}
