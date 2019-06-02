/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class FractionMain {
    
    public static int fillNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        int a = input.nextInt();
        return a;
    }
    public static int fillDeno() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mau so: ");
        int a = input.nextInt();
        if(a == 0) {
            System.out.println("Mau so phai khac 0");
            return fillDeno();
        } else {
            return a;
        }
    }
    public static void display(int a, int b) {
        System.out.print("Phan so nhap vao la: " +a +"/" +b +"\n");
    }
    public static void displaySimplify(int a, int b) {
        if(b != 1) {
            System.out.print("Phan so sau khi toi gian la: " +a +"/" +b +"\n");
        } else {
            System.out.print("Phan so sau khi toi gian la: " +a +"/" +b + " = " +a +"\n");
        }
    }

    
    public static void main(String[] args) {
        Fraction F = new Fraction();
        F.setNumber(fillNumber());
        F.setDeno(fillDeno());
        display(F.getNumber(), F.getDeno());
        F.simplify(F.getNumber(), F.getDeno());
        displaySimplify(F.getNumber(), F.getDeno());
    }
}
