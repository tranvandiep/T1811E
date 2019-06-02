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

public class QuadraticEquation {
	
    public static void fillFactor() {
            double a = fillFactorA();
            Scanner input = new Scanner(System.in);
            System.out.print("Nhap he so thu 2: ");
            double b = input.nextDouble();
            System.out.print("Nhap he so thu 3: ");
            double c = input.nextDouble();
            calculation(a, b, c);
    }
    public static double fillFactorA() {
            Scanner input = new Scanner(System.in);
            System.out.print("Nhap he so thu 1: ");
            double a = input.nextDouble();
            if(a == 0) {
                    System.out.println("He so thu 1 phai khac 0");
                    a = refillFactorA();
            }
            return a;
    }
    public static double refillFactorA() {
            Scanner input = new Scanner(System.in);
            System.out.print("Nhap he so thu 1: ");
            double newA = input.nextDouble();
            return newA;
    }
    public static void calculation(double a, double b, double c) {
            double delta;
            double root;
            double root1, root2;
            delta = b*b - 4*a*c;
            if(delta < 0) {
                    noRoot();
            }
            if(delta == 0) {
                    root = -b/(2*a);
                    doubleRoot(root);
            }
            if(delta > 0) {
                    root1 = (-b + Math.sqrt(delta))/2*a;
                    root2 = (-b - Math.sqrt(delta))/2*a;
                    differRoot(root1, root2);
            }
    }
    public static void noRoot() {
            System.out.println("Phuong trinh vo nghiem");
    }
    public static void doubleRoot(double root) {
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + root);
    }
    public static void differRoot(double root1, double root2) {
            System.out.println("Phuong trinh co 2 nghiem phan biet");
            System.out.print("Nghiem thu 1: " + root1 + "\n");
            System.out.print("Nghiem thu 2: " + root2 + "\n");
    }


    public static void main(String[] args) {
            fillFactor();
    }
}
