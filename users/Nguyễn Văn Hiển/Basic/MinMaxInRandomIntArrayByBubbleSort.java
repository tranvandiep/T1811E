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

public class MinMaxInRandomIntArrayByBubbleSort {
    public static int fillAmountElement() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int a = input.nextInt();
        if(a == 0) {
            System.out.println("Mang phai co toi thieu 1 phan tu");
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
    public static int[] minMaxArr(int[] arr) {
        int[] mmArr = new int[arr.length];
        int num;
        for(int i = 0; i < arr.length; i ++) {
            mmArr[i] = arr[i];
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = arr.length - 1; j >= 1; j--) {
                if(mmArr[j] < mmArr[j-1]) {
                    num = mmArr[j];
                    mmArr[j] = mmArr[j-1];
                    mmArr[j-1] = num;
                }
            }
        }
        return mmArr;
    }
    public static void displayArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Phan tu thu %d la: %d\n", i, arr[i]);
        }
    }
    public static void displayMinMaxInArr(int[] arr) {
        if(arr[arr.length-1] > arr[0]) {
            System.out.printf("Phan tu lon nhat la: %d\n", arr[arr.length-1]);
            System.out.printf("Phan tu nho nhat la: %d\n", arr[0]);
        }
        if(arr[arr.length-1] < arr[0]) {
            System.out.printf("Phan tu lon nhat la: %d\n", arr[0]);
            System.out.printf("Phan tu nho nhat la: %d\n", arr[arr.length-1]);
        }
    }
    
    public static void main(String[] args) {
        int a = fillAmountElement();
        int[] randomArr = loadArr(a);
        displayArr(randomArr);
        int[] minMaxArr = minMaxArr(randomArr);
        displayMinMaxInArr(minMaxArr);
    }
}
