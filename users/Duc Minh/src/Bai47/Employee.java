/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai47;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Employee {

    String ten;
    String gioiTinh;
    String queQuan;
    String chucVu;
    double luong;

    public Employee() {
    }

    public Employee(String ten, String gioiTinh, String queQuan, String chucVu, double luong) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        ten = input.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = input.nextLine();
        System.out.println("Nhap que quan: ");
        queQuan = input.nextLine();
        System.out.println("Nhap chuc vu: ");
        chucVu = input.nextLine();
        System.out.println("Nhap luong: ");
        luong = Double.parseDouble(input.nextLine());
    }

    public void dishplay() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Employee{" + "ten=" + ten + ", gioiTinh=" + gioiTinh + ", queQuan=" + queQuan + ", chucVu=" + chucVu + ", luong=" + luong + '}';
    }

}
