/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai47;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Product {

    private String maHH;
    private String tenHH;
    private float soLuong;
    private float gia1SP;

    public Product() {
    }

    public Product(String maHH, String tenHH, float soLuong, float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ma hang: ");
        maHH = input.nextLine();
        System.out.println("Nhap ten hang: ");
        tenHH = input.nextLine();
        System.out.println("Nhap so luong hang: ");
        soLuong = Float.parseFloat(input.nextLine());
        System.out.println("Nhap gia san pham: ");
        gia1SP = Float.parseFloat(input.nextLine());
    }

    @Override
    public String toString() {
        return "Product{" + "maHH=" + maHH + ", tenHH=" + tenHH + ", soLuong=" + soLuong + ", gia1SP=" + gia1SP + '}';
    }

    public void display() {
        System.out.println(toString());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n phan tu Product: ");
        int n = Integer.parseInt(input.nextLine());
        Product[] productList = new Product[n];

        for (int i = 0; i < n; i++) {
            productList[i] = new Product();
            productList[i].input();
        }

        int cache = 0;
        for (int i = 1; i < n; i++) {
            if (productList[i].getGia1SP() > productList[cache].getGia1SP()) {
                cache = i;
            }
        }
        System.out.println("San pham co gia cao nhat la: ");
        productList[cache].display();
    }
}
