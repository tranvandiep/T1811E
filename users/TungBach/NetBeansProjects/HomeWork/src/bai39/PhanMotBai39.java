/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai39;

import java.util.Scanner;



/**
 *
 * @author Admin
 */
public class PhanMotBai39 {
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        Scanner scan = new Scanner(System.in);
        int tong = 0;
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i< arr.length; i++){
            System.out.println("a[" +i+ "] = ");
            arr[i] = scan.nextInt();
            tong += arr[i];
        }
        System.out.println("Các giá trị được nhập vào là: ");
        for(int x : arr){
            System.out.println(" "+x+" ");
        }
        System.out.format("tong cac gia tri la: %d ", tong);
        
    }
}

   

 
