/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.QuanLySinhVien;

import java.util.Scanner;

/**
 *
 * @author LQT
 */
public class Person {

    private String Ten;
    private String GioiTinh;
    private String NgaySinh;
    private String DiaChi;

    public Person() {
    }

    public Person(String Ten, String GioiTinh, String NgaySinh, String DiaChi) {
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void inputinfo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ten: ");
        this.Ten = input.nextLine();

        System.out.println("Nhap gioi tinh: ");
        this.GioiTinh = input.nextLine();

        System.out.println("Nhap ngay sinh: ");
        this.NgaySinh = input.nextLine();

        System.out.println("Nhap dia chi: ");
        this.DiaChi = input.nextLine();

    }

    public void showinfo() {
        System.out.println("Ten :" + this.Ten);
        System.out.println("Gioi tinh :" + this.GioiTinh);
        System.out.println("Ngay sinh : " + this.NgaySinh);
        System.out.println("Dia chi : " + this.DiaChi);
    }

}
