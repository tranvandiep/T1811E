/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;
import java.util.Scanner;
/**
 *
 * @author HP ENVY
 */
public class Test1 {
    
    public static void main(String[] args) {
            int n=10;
            int[] a = new int[n];
            int sum = 0;
            Scanner nhapMang = new Scanner(System.in);
            for (int i = 0; i <n; i++) {
                System.out.printf("Nhap phan tu thu %d: ",i+1);
                a[i] = nhapMang.nextInt();
                sum += a[i];
            }
            System.out.printf("Tong cua mang vua nhap la : %d", sum);  
    }
    
}
