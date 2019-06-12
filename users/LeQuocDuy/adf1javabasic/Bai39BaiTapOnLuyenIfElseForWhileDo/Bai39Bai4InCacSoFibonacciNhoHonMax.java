/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai39BaiTapOnLuyenIfElseForWhileDo;

import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class Bai39Bai4InCacSoFibonacciNhoHonMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Max;
        int Fibo1 = 1;
        int Fibo2 = 1;
        int temp = 0;
        System.out.println("Nhap so Max: ");
        Max = input.nextInt();
        
        System.out.println("Day so FIBONACCI thoa man dieu kien la: ");
        
        System.out.print(Fibo1 + ", ");
        System.out.print(Fibo2 + ", ");
        
        while(temp < Max){
            temp = Fibo1 + Fibo2;
            if(temp < Max){
                System.out.print(temp + ", ");
            }
            Fibo1 = Fibo2;
            Fibo2 = temp;
        }
    }
    
}
