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

public class PerfectNumberInArray {
    public static int fillAmountElement() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int a = input.nextInt();
        if(a <= 0) {
            System.out.println("Mang phai co toi thieu 1 phan tu");
            return fillAmountElement();
        } else {
            return a;
        }
    }
    public static int fillElement(int i) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap phan tu thu %d: ", i);
        int a = input.nextInt();
        return a;
    }
    public static int[] loadArr(int a) {
        int[] arr = new int[a];
        for(int i = 0; i < a; i++) {
            arr[i] = fillElement(i);
        }
        return arr;
    }
    public static void checkPerfectNumber(int[] arr) {
        int flag = 0;
        for(int i = 0; i < arr.length; i++) {
            int Sum = 0;
            for(int j = 1; j < arr[i]; j++) {
                if(arr[i]%j == 0) {
                    Sum = Sum + j;
                }
            }
            if(Sum == arr[i] && arr[i] != 0) {
                System.out.printf(" %d ", arr[i]);
                flag++;
            }
        }
        if(flag == 0) {
            System.out.println("Mang khong co so hoan hao nao");
        }
    }
    public static void displayArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf(" %d ", arr[i]);
        }
    }
    
    public static void main(String[] args) {
        int a = fillAmountElement();
        int[] intArr = loadArr(a);
        displayArr(intArr);
        System.out.println("\nCac so hoan hao trong mang la: ");
        checkPerfectNumber(intArr);
    }
}
