/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.hanoi;

import house.cm.House;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class HaNoiHouse extends House {

    private String tenQuan;

    public HaNoiHouse() {
    }

    public HaNoiHouse(String tenQuan, String soNha, String diaChi, String loaiNha) {
        super(soNha, diaChi, loaiNha);
        this.tenQuan = tenQuan;
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ten Quan: ");
        tenQuan = input.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "HaNoiHouse{" + "tenQuan=" + tenQuan + '}';
    }

}
