/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Fraction2Main {
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
    public static int[] reduceSameDeno(int[] arr) {
        int x = arr[1];
        int y = arr[3];
        int[] newArr = new int[4];
        
        while(x != y) {
            if(x > y) {
                x -= y; 
            } else {
                y -= x;
            }
        }
        int z = (arr[1]*arr[3])/x;
        int a = z/arr[1];
        int b = z/arr[3];
        newArr[1] = newArr[3] = z;
        newArr[0] = arr[0]*a;
        newArr[2] = arr[2]*b;

        return newArr;
    }
    public static void sumFrac(int[] arr) {
        System.out.print("Tong 2 phan so la: " +(arr[0]+arr[2]) +"/" +arr[1] +"\n");
    }
    public static void subFrac(int[] arr) {
        System.out.print("Hieu 2 phan so la: " +(arr[0]-arr[2]) +"/" +arr[1] +"\n");
    }

    public static int[] multiFrac(int[] arr) {
        int a;
        int b;
        int[] newArr = new int[2];
        
        newArr[0] = arr[0]*arr[2];
        newArr[1] = arr[1]*arr[3];
        return newArr;
    }
    public static int[] diviFrac(int[] arr) {
        int a;
        int b;
        int[] newArr = new int[2];
        
        newArr[0] = arr[0]*arr[3];
        newArr[1] = arr[1]*arr[2];
        return newArr;
    }

    public static void display(int a, int b) {
        System.out.print("Phan so nhap vao la: " +a +"/" +b +"\n");
    }
    public static void displaySimplify(int a, int b, int c, int d) {
        if(d != 1) {
            System.out.print("Phan so sau khi toi gian la: " +a +"/" +b + " = " +c +"/" +d +"\n");
        } else {
            System.out.print("Phan so sau khi toi gian la: " +a +"/" +b +" = " +c +"/" +d +" = " +c +"\n");
        }
    }
    public static void displayMulti(int a, int b) {
        if(b != 1) {
            System.out.print("Tich 2 phan so la: " +a +"/" +b +"\n");
        } else {
            System.out.print("Tich 2 phan so la: " +a +"\n");
        }
    }
    public static void displayDivi(int a, int b) {
        if(b != 1) {
            System.out.print("Thuong 2 phan so la: " +a +"/" +b +"\n");
        } else {
            System.out.print("Thuong 2 phan so la: " +a +"\n");
        }
    }

    
    public static void main(String[] args) {
        Fraction F = new Fraction();
        int[] arr = new int[4];
        int[] simArr = new int[4];
        int[] sameArr = new int[4];
        int[] multiArr = new int[2];
        int[] diviArr = new int[2];
                
        for(int i = 0; i < 4; i+=2) {
            F.setNumber(fillNumber());
            arr[i] = F.getNumber();
            F.setDeno(fillDeno());
            arr[i+1] = F.getDeno();
            display(F.getNumber(), F.getDeno());
        }
        for(int i = 0; i < 4; i++) {
            simArr[i] = arr[i];
        }
        for(int i = 0; i < 4; i+=2) {
            F.simplify(simArr[i],simArr[i+1]);
            simArr[i] = F.getNumber();
            simArr[i+1] = F.getDeno();
            displaySimplify(arr[i], arr[i+1], simArr[i], simArr[i+1]);
        }
        sameArr = reduceSameDeno(simArr);
        sumFrac(sameArr);
        subFrac(sameArr);
        multiArr = multiFrac(simArr);
        F.simplify(multiArr[0], multiArr[1]);
        displayMulti(F.getNumber(), F.getDeno());
        diviArr = diviFrac(simArr);
        F.simplify(diviArr[0], diviArr[1]);
        displayDivi(F.getNumber(), F.getDeno());
    }

}
