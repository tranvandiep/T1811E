/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Chuong {

    int maChuong;
    List<Animal> AnimalList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public Chuong() {
    }

    public Chuong(int maChuong) {
        this.maChuong = maChuong;
    }

    public int getMaChuong() {
        return maChuong;
    }

    public void setMaChuong(int maChuong) {
        this.maChuong = maChuong;
    }

    void nhapChuong() {
        System.out.print("Nhap ma chuong: ");
        maChuong = Integer.parseInt(input.nextLine());
    }

    void themConVat() {
        System.out.print("Nhap so luong con vat: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            Animal animal = new Animal();
            AnimalList.get(i).nhapThongTin();

            AnimalList.add(animal);
        }
    }

    void xoaConVat() {
        System.out.print("Nhap ten con vat muon xoa: ");
        String ten = input.nextLine();
        for (Animal animalList : AnimalList) {
            if (animalList.getTen().equalsIgnoreCase(ten)) {
                AnimalList.remove(ten);
            }
        }

    }
}
