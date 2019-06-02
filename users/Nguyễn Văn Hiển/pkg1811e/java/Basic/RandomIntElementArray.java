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
import java.util.Random;

public class RandomIntElementArray {
    public static int fillAmountElement() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int a = input.nextInt();
        if(a == 0) {
            System.out.println("Mang toi thieu phai co 1 phan tu");
            return fillAmountElement();
        } else {
            return a;
        }
    }
    public static int[] loadArr(int a) {
        Random rd = new Random();
        int[] arr = new int[a];
        for(int i = 0; i < a; i++) {
            arr[i] = rd.nextInt();
        }
        return arr;
    }
    public static void displayArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Phan tu thu %d la: %d\n", i, arr[i]);
        }
    }
    
    public static void main(String[] args) {
        int a = fillAmountElement();
        int[] intRandomArr = loadArr(a);
        displayArr(intRandomArr);
    }
}
