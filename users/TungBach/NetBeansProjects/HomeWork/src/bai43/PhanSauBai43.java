/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai43;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanSauBai43 {
    public static void main(String[] args) {
        String number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so co 4 chu so:");
        number = sc.nextLine();
        
        for(int i=0; i<4; i++){
            switch(i){
                case 0:
                    System.out.println(number.charAt(i) +  " nghin ");
                    break;
                case 1:
                    System.out.println(number.charAt(i) +  " tram ");
                    break;
                case 2:
                    System.out.println(number.charAt(i) +  " chuc ");
                    break;
                case 3:
                    System.out.println(number.charAt(i) +  " don vi ");
                    break;
                default: ;
            }
        }
    }
}
