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
public class Person {
    String ten;
    String gioiTinh;
    String ngaySinh;
    String diaChi;

    Scanner inputInfo = new Scanner(System.in);
    
    public Person() {
        super();
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    
    public void inputInfo() {
        System.out.println("Nhap ho ten sinh vien: ");
        ten = inputInfo.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = inputInfo.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = inputInfo.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = inputInfo.nextLine();
        
    }
    
    public void showInfo() {
        System.out.println("Ho ten: " +ten);
        System.out.println("Gioi tinh: " +gioiTinh);
        System.out.println("Ngay sinh: " +ngaySinh);
        System.out.println("Dia chi: " +diaChi);
    }
}
