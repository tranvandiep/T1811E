/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.cm;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class House implements IHouse{
    private String soNha;
    private String diaChi;
    private String loaiNha;

    public House() {
    }

    public House(String soNha, String diaChi, String loaiNha) {
        this.soNha = soNha;
        this.diaChi = diaChi;
        this.loaiNha = loaiNha;
    }

    public String getSoNha() {
        return soNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }
    
    Scanner input = new Scanner(System.in);
    @Override
    public void input() {
        System.out.printf("Nhap so nha: ");
        soNha = input.nextLine();
        System.out.printf("Nhap dia chi: ");
        diaChi = input.nextLine();
        System.out.printf("Nhap loai nha: ");
        loaiNha = input.nextLine();
    }

    @Override
    public void display() {
        System.out.printf("So nha: %s",soNha);
        System.out.printf("Dia chi: %s",diaChi);
        System.out.printf("Loai nha: %s",loaiNha);
    }
    
    
}
