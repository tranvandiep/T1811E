/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai46;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Country {

    String ten;
    String viTri;

    public Country() {
    }

    public Country(String ten, String viTri) {
        this.ten = ten;
        this.viTri = viTri;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ten nuoc: ");
        ten = input.nextLine();
        System.out.println("Nhap ten hang: ");
        viTri = input.nextLine();
    }

    @Override
    public String toString() {
        return "Country{" + "ten=" + ten + ", viTri=" + viTri + '}';
    }

    public void display() {
        System.out.println(toString());
    }

}
