/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession2;

import java.util.Scanner;

/**
 *
 * @author Diep.Tran
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }
//        int x = 5;//x = 5
//        int y = x++;//x = 6, y = 5
//        int z = ++x;//x = 7, y = 5, z = 7;
//        //t = 5 + 7 - 6
//        int t = y++ + ++y - --z;//t = 5 + 7 - 6 = 6
//        System.out.printf("x = %d, y = %d, z = %d, t = %d", x, y, z, t);
//        String fullname;
//        int age;
//        String address;
//        
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap ten : ");
//        fullname = input.nextLine();
//        System.out.println("Nhap tuoi : ");
//        age = Integer.parseInt(input.nextLine());
//        System.out.println("Nhap dia chi : ");
//        address = input.nextLine();
//        
//        System.out.printf("Ten : %s, tuoi : %d, dia chi : %s", fullname, age, address);
    }
}
