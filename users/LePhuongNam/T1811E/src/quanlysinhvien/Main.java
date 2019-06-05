/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Main {

    public static void main(String[] args) {
        int a;
        boolean count = true;
        List<SinhVien> sinhVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Nhap torng tin sinh vien");
            System.out.println("2. In ra thong tin sinh vien");
            System.out.println("3. Thoat chuong trinh");
            do {
                System.out.println("Nhap chu so tuong ung voi yeu cau cua ban : ");
                a = Integer.parseInt(scanner.nextLine());
            } while (a < 1 && a > 3);

            switch (a) {
                case 1:
                    System.out.println("Nhap theo thu tu (nhan 'Enter' sau moi muc nhap) : tên, tuổi, địa chỉ, email, sđt");
                    SinhVien std = new SinhVien(scanner.nextLine(), Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
                    sinhVien.add(std);
                    ;
                    break;
                case 2:
                    System.out.println("\n");
                    for (int i = 0; i < sinhVien.size(); i++) {
                        SinhVien std2 = sinhVien.get(i);
                        std2.inSinhVien();
                        System.out.println("\n");
                    }
                    System.out.println("\n");
                    ;
                    break;
                default:
                    count = false;
            }
        } while (count);

    }

}
