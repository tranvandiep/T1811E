/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;
import java.util.Scanner;
/**
 *
 * @author HP ENVY
 */
public class Test2 {
    public static void main(String[] args) {
        int n;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang: ");
        n = nhap.nextInt();
        int []A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i+1); 
            A[i] = nhap.nextInt();
            
        }
        int sum = 0;
        for(int i = 0; i <n; i++) {
            System.out.println(A[i]);
            if(A[i] %3 == 0) {
                sum += A[i];
            }
        }
        System.out.printf("Tong cac so chia het cho 3 la %d", sum);
        
            
        
    }
    
}
