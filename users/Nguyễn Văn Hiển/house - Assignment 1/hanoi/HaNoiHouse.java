/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.hanoi;

import house.cm.House;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class HaNoiHouse extends House {
    private String tenQuan;
    Scanner input = new Scanner(System.in);

    public HaNoiHouse() {
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    @Override
    public String toString() {
        return (super.getLoaiNha() +" - " +this.tenQuan + " - " +super.getDiaChi() +" - " +super.getSoNha());
    }
    
    @Override
    public void display() {
        System.out.println(toString());
    }
    
    @Override
    public void input() {
        System.out.print("Nhập tên Quận: ");
        this.tenQuan = input.nextLine();
        System.out.print("Nhập số nhà: ");
        super.setSoNha(input.nextLine());
        System.out.print("Nhập địa chỉ: ");
        super.setDiaChi(input.nextLine());
        System.out.print("Nhập loại nhà: ");
        super.setLoaiNha(input.nextLine());
    }

    public HaNoiHouse(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    public HaNoiHouse(String tenQuan, String soNha, String diaChi, String loaiNha) {
        super(soNha, diaChi, loaiNha);
        this.tenQuan = tenQuan;
    }
 
    
}
