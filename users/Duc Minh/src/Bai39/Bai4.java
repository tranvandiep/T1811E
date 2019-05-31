/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai39;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Bai4 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so max:");
        int N = input.nextInt();
        int f0=1, f1=1, fn=0;
     
            while(fn < N){
                System.out.printf("%d ", fn);
                if(fn<2){
                    System.out.printf("%d ", f0);
                    System.out.printf("%d ", f1);
                }
                fn=f0+f1;
                f0=f1;
                f1=fn;
            }

    }
}
