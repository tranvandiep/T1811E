/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai30;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanBaBai30 {
    public static void main(String[] args) {
        String fullname;
        int age;
        String address;
        String email;
        String phonenumber;
        
        Scanner sinhvien = new Scanner(System.in);
        
        System.out.println("NhapTen:");
        fullname = sinhvien.nextLine();
        System.out.println("NhapTuoi:");
        age = sinhvien.nextInt();
        System.out.println("NhapDiaChi:");
        address = sinhvien.nextLine();
        System.out.println("NhapEmail:");
        email = sinhvien.nextLine();
        System.out.println("NhapSoDienThoai:");
        phonenumber = sinhvien.nextLine();
        
        System.out.format("Ten: %s, Tuoi: %d, DiaChi: %s, Email: %s, SoDienThoai: %s",fullname, age, address, email, phonenumber);
        
    }
}
