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
 * @author Admin
 */
public class HaNoiHouse extends House {
    private String tenQuan;

    public HaNoiHouse() {
    }

    public HaNoiHouse(String tenQuan) {
        this.tenQuan = tenQuan;
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
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner input = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên quán: ");
        tenQuan  = input.nextLine();
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Tên quán " + tenQuan);
    }
    
    
}
