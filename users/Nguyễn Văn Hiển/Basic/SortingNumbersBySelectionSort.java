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

public class SortingNumbersBySelectionSort {
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
        int[] sortArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            sortArr[i] = arr[i];
        }
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(sortArr[j] < sortArr[i]) {
                    int element = sortArr[i];
                    sortArr[i] = sortArr[j];
                    sortArr[j] = element;

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
