/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai66;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Circle {

    float banKinh;

    public double getPI() {
        return Math.PI;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh = input.nextFloat();
    }

    public float tinhChuVi() {
        return (float) (2 * getPI() * banKinh);
    }

    public float tinhDienTich() {
        return (float) (getPI() * Math.pow(banKinh, 2));
    }
}
