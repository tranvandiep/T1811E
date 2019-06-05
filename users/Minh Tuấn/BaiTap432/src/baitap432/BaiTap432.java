/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap432;

import java.util.Scanner;

public class BaiTap432{
   public static void main(String[] args){
        int a;
        double z;
        String d;
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap 1 so nguyen: ");
        a = Integer.parseInt(input.nextLine());
        System.out.printf("Nhap 1 so double: ");
        z = Integer.parseInt(input.nextLine());
        System.out.printf("Nhap 1 chuoi: ");
        d = input.nextLine();
        System.out.printf("So nguyen: %d",a);
        System.out.printf("So double: %d",z);
        System.out.printf("Chuoi: %s",d);
    }
}
   


    
