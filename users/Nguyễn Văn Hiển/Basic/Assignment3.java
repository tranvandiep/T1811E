/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.Basic;

import java.util.Scanner;

/**
 *
 * @author PC
 */

public class Assignment3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ho ten: ");
        String name = input.nextLine();
        System.out.print("Do tuoi: ");
//        int age = input.nextInt();
//        input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        System.out.print("Gioi tinh: ");
        String sex = input.nextLine();
        System.out.print("Dia chi: ");
        String address = input.nextLine();
        
        System.out.println(name + " " +age + " " +sex +" " +address);
    }
}
