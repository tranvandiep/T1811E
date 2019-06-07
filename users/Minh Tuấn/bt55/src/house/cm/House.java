/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.cm;

import java.util.Objects;
import java.util.Scanner;
/**
 *
 * @author Admin
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
    public boolean equals(Object obj) {
        boolean serch;
        if (this == obj) {
            serch = true;
        }
        if (obj == null) {
            serch = false;
        }
        if (getClass() != obj.getClass()) {
            serch = false;
        }
        final House other = (House) obj;
        if (!Objects.equals(this.soNha, other.soNha) && !Objects.equals(this.diaChi, other.diaChi)) {
            serch = false;
        } else {
            serch = true;
        }
        return serch;
    }

    @Override
    public String toString() {
        return "House{" + "soNha=" + soNha + ", diaChi=" + diaChi + ", loaiNha=" + loaiNha + '}';
    }
    
    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap so nha : ");
        setSoNha(scanner.nextLine());
        
        System.out.println("Nhap dia chi : ");
        setDiaChi(scanner.nextLine());
        
        System.out.println("Nhap loai nha : ");
        setLoaiNha(scanner.nextLine());
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

}
