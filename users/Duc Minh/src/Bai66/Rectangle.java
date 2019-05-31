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
public class Rectangle {

    float chieuDai;
    float chieuRong;

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        chieuDai = input.nextFloat();
        System.out.print("Nhap chieu rong: ");
        chieuRong = input.nextFloat();
    }

    public float tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public float tinhDienTich() {
        return chieuDai * chieuRong;
    }
}
