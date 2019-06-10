/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package House.HaNoi;
import House.CM.House;
import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class HaNoiHouse extends House{
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
    public void input(){
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten Quan: ");
        tenQuan = input.nextLine();
    }
    @Override
    public void display(){
        System.out.printf("So nha : %s, " + "Dia chi : %s" + "Loai nha : %s" +
                "Ten quan : %s", getSoNha(), getDiaChi(), getLoaiNha(),
                tenQuan);
    }
}
