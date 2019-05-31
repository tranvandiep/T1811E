/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Zoo {

    Scanner input = new Scanner(System.in);
    ArrayList<Chuong> DanhSachChuong = new ArrayList<>();

    void themChuong() {
        System.out.print("Nhap so luong chuong: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            Chuong chuong = new Chuong();
            DanhSachChuong.get(i).nhapChuong();

            DanhSachChuong.add(chuong);
        }

    }

    public void xoaChuong() {
        System.out.print("Nhap ma chuong muon xoa: ");
        int machuong = Integer.parseInt(input.nextLine());
        for (Chuong dsChuong : DanhSachChuong) {
            if (dsChuong.getMaChuong() == machuong) {
                DanhSachChuong.remove(machuong);
            }
        }
    }
}
