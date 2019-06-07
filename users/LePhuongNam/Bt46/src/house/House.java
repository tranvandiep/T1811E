/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class House {
    String diaChi;
    float dienTich;
    int soTang;
    int namXayDung;

    public House() {
    }

    public House(String diaChi, float dienTich, int soTang, int namXayDung) {
        this.diaChi = diaChi;
        this.dienTich = dienTich;
        this.soTang = soTang;
        this.namXayDung = namXayDung;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public int getNamXayDung() {
        return namXayDung;
    }

    public void setNamXayDung(int namXayDung) {
        this.namXayDung = namXayDung;
    }

    @Override
    public String toString() {
        return "House{" + "diaChi=" + diaChi + ", dienTich=" + dienTich + ", soTang=" + soTang + ", namXayDung=" + namXayDung + '}';
    }
    
    void input(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap dia chi : ");
        setDiaChi(scanner.nextLine());
        
        System.out.println("Nhap dien tich : ");
        setDienTich(Float.parseFloat(scanner.nextLine()));
        
        System.out.println("Nhap dia chi : ");
        setSoTang(Integer.parseInt(scanner.nextLine()));
        
        System.out.println("Nhap dia chi : ");
        setNamXayDung(Integer.parseInt(scanner.nextLine()));
    }
    
    void display(){
        System.out.println(toString());
    }

}
