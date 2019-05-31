/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai43;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Bai3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap so thu 1:");
        int a = input.nextInt();
        System.out.print("Nhap so thu 2:");
        int b = input.nextInt();
        System.out.print("Nhap so thu 3:");
        int c = input.nextInt();
        
        if(a>=b){
            if(a>=c){
                System.out.printf("Max la: %d ", a);    
                if(b>=c){
                    System.out.printf("Min la: %d ", c);
                }else{
                    System.out.printf("Min la: %d ", b);
                }
            }else{
                System.out.printf("Max la: %d ", c);
                System.out.printf("Min la: %d ", b);
            }     
        }else{
            if(a>=c){
                System.out.printf("Max la: %d ", b);
                System.out.printf("Min la: %d ", c);
            }else{
                if(b>=c){
                   System.out.printf("Max la: %d ", b);
                   System.out.printf("Min la: %d ", a);
                }else{
                    System.out.printf("Max la: %d ", b);
                    System.out.printf("Min la: %d ", c);
                }
            }
        }    
            
     
        
    }    
}
