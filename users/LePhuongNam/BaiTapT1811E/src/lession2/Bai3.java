/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession2;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Bai3 {

    public static void main(String[] args) {
        String ten, diaChi, email, soDienThoai;
        int tuoi;
        
        System.out.println("Bài 3 : Nhập thông tin sinh viên gồm các thuộc tính : Tên, tuổi, địa chỉ, email, số điện thoại. Và hiển thị thông tin ra màn hình sau khi nhập.");
        Scanner scanner = new Scanner(System.in);
        
//        Nhap thong tin sinh vien
        System.out.println("Nhap ten sinh vien : ");
        ten = scanner.nextLine();
        System.out.println("Nhap tuoi sinh vien : ");
        tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap dia chi sinh vien : ");
        diaChi = scanner.nextLine();
        System.out.println("Nhap email sinh vien : ");
        email = scanner.nextLine();
        System.out.println("Nhap so dien thoai sinh vien : ");
        soDienThoai = scanner.nextLine();
        
//        Hien thi thong tin sinh vien vua nhap
        System.out.println("Ten : " + ten);
        System.out.println("Tuoi : " + tuoi);
        System.out.println("Dia chi : " + diaChi);
        System.out.println("Email : " + email);
        System.out.println("So dien thoai : " + soDienThoai);
    }
}
