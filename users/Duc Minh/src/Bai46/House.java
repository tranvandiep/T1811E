/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai46;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class House {

    String diaChi;
    String tenChu;

    public House() {
    }

    public House(String diaChi, String tenChu) {
        this.diaChi = diaChi;
        this.tenChu = tenChu;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTenChu() {
        return tenChu;
    }

    public void setTenChu(String tenChu) {
        this.tenChu = tenChu;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap dia chi: ");
        diaChi = input.nextLine();
        System.out.println("Nhap ten chu ho: ");
        tenChu = input.nextLine();
    }

    @Override
    public String toString() {
        return "House{" + "diaChi=" + diaChi + ", tenChu=" + tenChu + '}';
    }

    public void display() {
        System.out.println(toString());
    }

}
