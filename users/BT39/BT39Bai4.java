/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT39;

import java.util.Scanner;

public class BT39Bai4 {
    
    public static int fibonacci(int k) {
	if(k<0) return -1;
        else if((k==0)||(k==1)) {
            return k;
	}
        else {
            return fibonacci(k - 1) + fibonacci(k - 2);
	}
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap so Max: ");
        int max = Integer.parseInt(input.nextLine());
        
        for (int i =0; fibonacci(i) <max; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
