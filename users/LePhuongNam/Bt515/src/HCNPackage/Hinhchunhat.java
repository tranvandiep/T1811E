/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HCNPackage;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Hinhchunhat implements HCNInterface{
    
    int chieuDai;
    int chieuRong;
    int dienTich;

    public Hinhchunhat() {
    }

    public Hinhchunhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    @Override
    public int dientichHCN() {
        this.dienTich = ((this.chieuDai + this.chieuRong) * 2);
        return this.dienTich; 
    }

    @Override
    public int getChieuDai() {
        return this.chieuDai;
    }

    @Override
    public int getChieuRong() {
        return this.chieuRong;
    }

    public int getDienTich() {
        return dienTich;
    }

    @Override
    public String toString() {
        return "Hinhchunhat{" + "chieuDai=" + getChieuDai() + ", chieuRong=" + getChieuRong() + ", dienTich=" + getDienTich() + '}';
    }
    
    public void display(){
        System.out.println(toString());
    }

    @Override
    public void setDaiRong() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap chieu dai HCN : ");
        this.chieuDai = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Nhap chieu rong HCN : ");
        this.chieuRong = Integer.parseInt(scanner.nextLine());
    }
    
}
