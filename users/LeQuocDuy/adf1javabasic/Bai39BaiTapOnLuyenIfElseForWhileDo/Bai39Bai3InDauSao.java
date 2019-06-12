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
public class Bai39Bai3InDauSao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.print("Nhap N: ");
        N = input.nextInt();
        
        for(int i = 0; i <= N; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");  
        };
    }
}
