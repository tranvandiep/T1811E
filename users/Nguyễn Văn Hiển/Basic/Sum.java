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

public class Sum {
    
    public static void main(String[] args) {
        int[] Integer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int S = 0;
        for(int i = 0; i < 10; i++) {
            S = S + Integer[i];
        }
        System.out.printf("S = %d \n", S);
    }
}
