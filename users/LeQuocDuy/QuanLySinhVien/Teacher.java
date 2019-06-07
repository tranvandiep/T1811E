/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.QuanLySinhVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class Teacher extends Person {

    private float luong1GioiDay;
    private float gioDay;
    private String lopDay;

    public static ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();

    public Teacher() {
        listTeacher.add(this);
    }

    public Teacher(int luong1GioiDay, int gioDay, String lopDay) {
        this.luong1GioiDay = luong1GioiDay;
        this.gioDay = gioDay;
        this.lopDay = lopDay;
    }

    public Teacher(int luong1GioiDay, int gioDay, String lopDay, String Ten, String GioiTinh, String NgaySinh, String DiaChi) {
        super(Ten, GioiTinh, NgaySinh, DiaChi);
        this.luong1GioiDay = luong1GioiDay;
        this.gioDay = gioDay;
        this.lopDay = lopDay;
        listTeacher.add(this);

    }

    public float getLuong1GioiDay() {
        return luong1GioiDay;
    }

    public void setLuong1GioiDay(int luong1GioiDay) {
        this.luong1GioiDay = luong1GioiDay;
    }

    public float getGioDay() {
        return gioDay;
    }

    public void setGioDay(int gioDay) {
        this.gioDay = gioDay;
    }

    public String getLopDay() {
        return lopDay;
    }

    public void setLopDay(String lopDay) {
        this.lopDay = lopDay;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void inputinfo() {

        super.inputinfo();
        System.out.println("Nhap vao ma lop day : ");
        lopDay = scanner.nextLine();

        System.out.println("Nhap vao luong mot gio day : ");
        luong1GioiDay = Float.parseFloat(scanner.nextLine());

        System.out.println("Nhap vao so gio day trong thang : ");
        gioDay = Float.parseFloat(scanner.nextLine());
    }
    
    @Override
    public void showinfo(){
        super.showinfo();
        System.out.println("Ma lop day : " + this.lopDay);
        System.out.println("Luong 1 gio day : " + this.luong1GioiDay);
        System.out.println("So gio day trong thang : " + this.gioDay);
        System.out.println("Luong thuc nhan trong 1 thang : " + this.luongThucNhan());
    }
    
    public float luongThucNhan(){
        float luongThucNhan;
        if(lopDay.endsWith("L")|| lopDay.endsWith("l") || lopDay.endsWith("M") || lopDay.endsWith("m")){
            luongThucNhan = luong1GioiDay * gioDay + 200000;
        }
        else{
            luongThucNhan = luong1GioiDay * gioDay;
        }
        return luongThucNhan;
    }
}
