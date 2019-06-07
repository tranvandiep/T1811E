/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class Main {
    public static void main(String[] args) {
        Person s1 = new Person();
        Student s2 = new Student();        
        Scanner scanner = new Scanner(System.in);
        int n;
        int tuyChon;

        System.out.print("Nhap vao so sinh vien, N = ");
        n = scanner.nextInt();
        Student[] sv = new Student[n];
        int i;

        do {
            System.out.println("\t---Menu---");
            System.out.println("1. Nhap sinh vien");
            System.out.println("2. Hien thi tat ca sinh vien");
            System.out.println("3. Hien thi sinh vien co diem cao nhat/thap nhat");
            System.out.println("4. Tim kiem theo ma sinh vien");
            System.out.println("5. Sap xem sinh vien theo ten");
            System.out.println("6. Danh sach sinh vien dat hoc bong");
            System.out.println("7. Thoat");

            System.out.print("Lua chon: ");
            tuyChon = scanner.nextInt();

            switch (tuyChon) {
                case 1:
                    for (i = 0; i < n; i++) {
                        System.out.printf("Nhap thong tin cua sinh vien thu %d :  ", i+1);
                        sv[i] = new Student();
                        sv[i].inputInfo();
                    }
                    break;
                case 2:
                    for (i = 0; i < n; i++) {
                        System.out.printf("Thong tin cua sinh vien thu %d:  ", i+1);
                        sv[i].showInfo();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("this function will be available soon!");
                    break;
                case 4:
                    System.out.println("this function will be available soon!");
                    break;
                case 5:
                    System.out.println("this function will be available soon!");
                    break;
                case 6:
                    System.out.println("this function will be available soon!");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Sai, moi chon lai!");
                    break;
            }
        } while (tuyChon != 7);
    }
}
