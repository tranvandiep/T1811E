/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.hanoi;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class HaNoiHouse extends house.cm.House{
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
    public String toString() {
        return "HaNoiHouse{" + "soNha = " + getSoNha() + ", diaChi = " + getDiaChi() + ", loaiNha = " + getLoaiNha()+ ", tenQuan = " + tenQuan + '}';
    }
    
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ten quan : ");
        setTenQuan(scanner.nextLine());
    }
    
    @Override
    public void display() {
        System.out.println(toString());
    }
}
