/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1811e;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author DuongQuangHuy
 */
public class Bai39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner (System.in);
       int[] Array = new int[100];
       int tong = 0;
       for(int i = 1 ; i <=10 ; i++){
           System.out.println("nhap gia tri cho mang :" + i + ":" );
           Array[i] = input.nextInt();
           tong = tong + Array[i];
       }
       
        System.out.printf(" tong : %d" , tong);
    }
    
}
