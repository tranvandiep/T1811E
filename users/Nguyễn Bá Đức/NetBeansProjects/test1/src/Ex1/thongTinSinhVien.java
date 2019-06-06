/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class thongTinSinhVien {
    public static void main(String[] args) {
        String tenSv, diaChi, email, soDienThoai;
        int tuoi;
        System.out.println("THONG TIN SINH VIEN");
        Scanner nhap = new Scanner(System.in);
        
        //Nhap thong tin
        System.out.println("Nhap ten sinh vien:");
        tenSv = nhap.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = Integer.parseInt(nhap.nextLine());
        System.out.println("Nhap dia chi: ");
        diaChi = nhap.nextLine();
        System.out.println("Nhap email: ");
        email = nhap.nextLine();
        System.out.println("Nhap so dien thoai:");
        soDienThoai = nhap.nextLine();
        
        //In thong tin
        System.out.println("Thong tin sinh vien vua nhap: " );
        System.out.println("Ho va ten: "+ tenSv );
        System.out.println("Tuoi:" + tuoi);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Email: "+ email);
        System.out.println("Dien thoai lien he:"+ soDienThoai);
    }
}
