/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai66;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Circle cirle = new Circle();
        HinhChuNhat hcn = new HinhChuNhat();
        int choose;
        Scanner input = new Scanner(System.in);
        
        do{
            showMenu();
            choose = input.nextInt();
            
            switch(choose){
                case 1:
                    cirle.input();
                    break;
                case 2:
                    System.out.println("Chu vi hinh tron" + circle.tinhChuVi());
                    break;
                case 3:
                    System.out.println("Dien tich hinh tron" + circle.tinhDienTich());
                    break;
                case 4:
                    hcn.input();
                    break;
                case 5:
                    System.out.println("Chu vi hinh chu nhat"+ hcn.tinhChuVi());
                    break;
                case 6:
                    System.out.println("Dien tich hinh chu nhat"+ hcn.tinhDienTich());
                    break;
                case 7:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Nhap sai!");
            }
        }
    }
    static void showMenu(){
        System.out.println("1.Nhap thong tin hinh tron");
        System.out.println("2.Tinh chu vi hinh tron");
        System.out.println("3.Tinh dien tich hinh tron");
        System.out.println("4.Nhap thong tin hcn");
        System.out.println("5.Tinh chu vi hcn");
        System.out.println("6.Tinh dien tich hcn");
        System.out.println("7.Thoat");
        System.out.println("Choose: ");
    }
}
