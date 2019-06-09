/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentbai55;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HaNoiHouse extends House{
    private String TenQuan;

    public HaNoiHouse() {
    }

    public HaNoiHouse(String TenQuan) {
        this.TenQuan = TenQuan;
    }

    public HaNoiHouse(String TenQuan, String SoNha, String DiaChi, String LoaiNha) {
        super(SoNha, DiaChi, LoaiNha);
        this.TenQuan = TenQuan;
    }

    public String getTenQuan() {
        return TenQuan;
    }

    public void setTenQuan(String TenQuan) {
        this.TenQuan = TenQuan;
    }
    
    @Override
    public void input(){
        super.input();
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Nhap ten quan: ");
        TenQuan=input.nextLine();       
    }
    
    @Override
    public void dislay(){
        System.out.printf("So Nha %s; "+"Dia Chi %s; "+"Loai Nha %s; "+"Ten Quan %s; ",getSoNha(),getDiaChi(),getLoaiNha(),TenQuan);
        System.out.println("");
    }
}
