/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai39_bai2;

import java.util.Scanner;

/**
 *
 * @author DuongQuangHuy
 */
public class Bai39_bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int n;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n <= 0);
         
    int A[] = new int[n];
         
    System.out.println("Nhập các phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        A[i] = scanner.nextInt();
    }
         
    // tìm và hiển thị các phần tử trong mảng chia hết cho 5
    System.out.println("Các phần tử chia hết cho 5 là: ");
    int tong = 0;
    for (int i = 0; i < n; i++) {
        if (A[i] % 3 == 0) {
           tong = tong + A[i];
        }
    } 
        
        System.out.println("tong cac so chia het cho 3 la :" + tong);
  }
}
