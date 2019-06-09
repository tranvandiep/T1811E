/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai46;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Mark {
    double diemThi;
    String mon;

    public Mark() {
    }

    public Mark(double diemThi, String mon) {
        this.diemThi = diemThi;
        this.mon = mon;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap diem thi: ");
        diemThi = Double.parseDouble(input.nextLine());
        System.out.println("Nhap ten mon hoc: ");
        mon = input.nextLine();
    }

    @Override
    public String toString() {
        return "Mark{" + "diemThi=" + diemThi + ", mon=" + mon + '}';
    }

    public void display() {
        System.out.println(toString());
    }
}
