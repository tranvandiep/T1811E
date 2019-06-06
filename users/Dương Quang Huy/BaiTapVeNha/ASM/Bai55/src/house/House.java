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
        Scanner scan = new Scanner(System.in);
        
        System.out.println("nhap so nha : ");
        soNha = scan.nextLine();
        System.out.println("nhap dia chi : ");
        diaChi = scan.nextLine();
        System.out.println("nhap loai nha : ");
        loaiNha = scan.nextLine();
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "House{" + "soNha=" + soNha + ", diaChi=" + diaChi + ", loaiNha=" + loaiNha + '}';
    }

}
