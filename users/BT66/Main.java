/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT66;

import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int dai = 0, rong = 0,r = 0, Choose;
        Methods tinhtoan;
        tinhtoan = new Methods();
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("1.    Nhập thông tin hình tròn");
            System.out.println("2.    Tính chu vi hình tròn");
            System.out.println("3.    Tính diện tích hình tròn");
            System.out.println("4.    Nhập thông tin hcn");
            System.out.println("5.    Tính chu vi hcn");
            System.out.println("6.    Tính diện tích hcn");
            System.out.println("7.    Thoát.");
            System.out.println("Chose: ");
            Choose = Integer.parseInt(input.nextLine());
         
            switch(Choose) {
                case 1: 
                    System.out.println("nhap ban kinh r cua hinh tron: ");
                    r = Integer.parseInt(input.nextLine());
                    System.out.println("ban vua nhap ban kinh r la: " + r);
                    break;
                case 2: 
                    tinhtoan.circumference(r);
                    break;
                case 3: 
                    tinhtoan.Circle(r);
                    break;
                case 4: 
                    System.out.println("Nhap chieu dai va chieu rong cua hinh chu nhat: ");
                    dai = Integer.parseInt(input.nextLine());
                    rong = Integer.parseInt(input.nextLine());
                    System.out.printf("ban vua nhap chieu dai = %d va chieu rong = %d\n", dai, rong);
                    break;
                case 5: 
                    tinhtoan.perimeterRectangle(dai, rong);
                    break;
                case 6: 
                    tinhtoan.areaRectangle(dai, rong);
                    break; 
                case 7: 
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Input failed!");
                    break;
            }
            
        } while(Choose != 7);
    }
}
