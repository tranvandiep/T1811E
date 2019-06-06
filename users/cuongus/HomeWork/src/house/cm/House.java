/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.cm;

import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class House implements IHouse {
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

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so nha: ");
        soNha = input.nextLine();
        
        System.out.println("Nhap dia chi: ");
        diaChi = input.nextLine();
        
        System.out.println("Nhap loai nha: ");
        loaiNha = input.nextLine();
        
    }

    @Override
    public void dislay() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "House{" + "soNha=" + soNha + ", diaChi=" + diaChi + ", loaiNha=" + loaiNha + '}';
    }
    
    
}
