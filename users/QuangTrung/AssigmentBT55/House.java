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
public class House implements IHouse{
    private String SoNha;
    private String DiaChi;
    private String LoaiNha;

    public House() {
    }

    public House(String SoNha, String DiaChi, String LoaiNha) {
        this.SoNha = SoNha;
        this.DiaChi = DiaChi;
        this.LoaiNha = LoaiNha;
    }

    public String getSoNha() {
        return SoNha;
    }

    public void setSoNha(String SoNha) {
        this.SoNha = SoNha;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getLoaiNha() {
        return LoaiNha;
    }

    public void setLoaiNha(String LoaiNha) {
        this.LoaiNha = LoaiNha;
    }
    
    
    
    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so nha: ");
        SoNha =input.nextLine();
        System.out.println("Nhap dia chi nha: ");
        DiaChi=input.nextLine();
        System.out.println("Nhap loai nha: ");
        LoaiNha=input.nextLine();
    
    }

    @Override
    public void dislay() {
        System.out.println(toString());
        System.out.println("");
    }

    @Override
    public String toString() {
        return "House{" + "SoNha=" + SoNha + ", DiaChi=" + DiaChi + ", LoaiNha=" + LoaiNha + '}';
    }
    
    
}
