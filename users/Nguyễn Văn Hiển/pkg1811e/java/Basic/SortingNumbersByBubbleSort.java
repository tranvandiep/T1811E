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

public class SortingNumbersByBubbleSort {
    public static int fillAmount() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so so hang: ");
        int a = input.nextInt();
        if(a == 0) {
            System.out.println("So so hang phai khac 0");
            return fillAmount();
        } else {
            return a;
        }
    }
    public static int fillElement(int i) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap phan tu thu %d: ", i);
        int element = input.nextInt();
        return element;
    }
    public static int[] loadArray(int numOfElement) {
        int[] arr = new int[numOfElement];
        for(int i = 0; i < numOfElement; i++) {
            arr[i] = fillElement(i);
        }
        return arr;
    }
    public static int[] sortArray(int arr[]) {
        int element;
        int[] sortArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            sortArr[i] = arr[i];
        }
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = arr.length - 1; j >= 1; j--) {
                if(sortArr[j] < sortArr[j-1]) {
                    element = sortArr[j];
                    sortArr[j] = sortArr[j-1];
                    sortArr[j-1] = element;
                }
            }
        }
        return sortArr;
    }
    public static void displayArray(int arr[], int numOfElement) {
        for(int i = 0; i < numOfElement; i++) {
            System.out.printf(" %d ", arr[i]);
        }
    }
        
    
    public static void main(String[] args) {
        int a = fillAmount();
        int[] intArr = loadArray(a);
        int[] sortArr = sortArray(intArr);
        displayArray(sortArr, a);
    }
}
