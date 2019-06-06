/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

import java.util.Scanner;



/**
 *
 * @author DuongQuangHuy
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
    public void display() {
        
        System.out.printf("  so nha : %s  "
                + "  dia chi : %s  "
                + "  loai nha : %s  "
                + "  ten quan : %s  "
                , getSoNha() ,getDiaChi() , getLoaiNha(), tenQuan);
        System.out.println(" ");
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap ten quan : ");
        tenQuan = scan.nextLine();
        
        
    }
    
}
