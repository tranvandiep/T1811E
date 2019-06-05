/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainCalculator {
    public static void main(String[] args) {
        int x, y, chon;
        Scanner Input = new Scanner(System.in);
        Calculator PhepCong = new Calculator();
        
        for (;;) {
            System.out.printf("Chon phep cong: 1\n");
            System.out.printf("Chon phep tru: 2\n");
            System.out.printf("Chon phep nhan: 3\n");
            System.out.printf("Chon phep chia: 4\n");
            System.out.printf("Thoat Calculator: 5\n");
            
            System.out.printf("*****Chon phep tinh: ");
            chon = Integer.parseInt(Input.nextLine());
            
            if (chon == 1) {
                System.out.printf("__Nhap so thu nhat: ");
                x = Integer.parseInt(Input.nextLine());

                System.out.printf("__Nhap so thu hai: ");
                y = Integer.parseInt(Input.nextLine());
                
                PhepCong.cong(x, y);
            }
            
            else if (chon == 2) {
                System.out.printf("__Nhap so thu nhat: ");
                x = Integer.parseInt(Input.nextLine());

                System.out.printf("__Nhap so thu hai: ");
                y = Integer.parseInt(Input.nextLine());
                
                PhepCong.tru(x, y);
            }
            
            else if (chon == 3) {
                System.out.printf("__Nhap so thu nhat: ");
                x = Integer.parseInt(Input.nextLine());

                System.out.printf("__Nhap so thu hai: ");
                y = Integer.parseInt(Input.nextLine());
                
                PhepCong.nhan(x, y);
            }
            
            else if (chon == 4) {
                System.out.printf("__Nhap so thu nhat: ");
                x = Integer.parseInt(Input.nextLine());

                System.out.printf("__Nhap so thu hai: ");
                y = Integer.parseInt(Input.nextLine());
                
                if (y !=0) {
                    PhepCong.chia(x, y);
                }
                
                else {
                    System.out.printf("Ban chon so khong phu hop\n");
                }
            }
            
            if (chon ==5) {
                break;
            }
            
            else {
                System.out.printf("**********Moi ban nhap lai so******\n");
                continue;
            }
        }
        
        System.out.printf("Cam on ban da tin tuong va su dung Calculator!!!\n");
    }
}

