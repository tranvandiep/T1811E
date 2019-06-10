/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai81;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Book {
    String tenSach;
    String ngayXuatBan;
    String butDanh;

    public Book() {
    }

    public Book(String tenSach, String ngayXuatBan, String butDanh) {
        this.tenSach = tenSach;
        this.ngayXuatBan = ngayXuatBan;
        this.butDanh = butDanh;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(String ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public String getButDanh() {
        return butDanh;
    }

    public void setButDanh(String butDanh) {
        this.butDanh = butDanh;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ten sach: ");
        tenSach = input.nextLine();
        System.out.println("Nhap ngay xuat ban: ");
        ngayXuatBan = input.nextLine();
        System.out.println("Nhap but danh: ");
        butDanh = input.nextLine();
    }

    @Override
    public String toString() {
        return "Book{" + "tenSach=" + tenSach + ", ngayXuatBan=" + ngayXuatBan + ", butDanh=" + butDanh + '}';
    }

    public void display() {
        System.out.println(toString());
    }
}
