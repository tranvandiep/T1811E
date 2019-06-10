/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment522;

import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class People implements Infor{

    String ten;
    int tuoi;
    String diaChi;

    public People() {
    }

    public People(String ten, int tuoi, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "People{" + "ten=" + ten + ", tuoi=" + tuoi + ", diaChi=" + diaChi + '}';
    }
    
    @Override
    public void showInfor() {
        System.out.println(toString());
    }
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ten People : ");
        setTen(scanner.nextLine());
        
        System.out.println("Nhap tuoi People : ");
        setTuoi(Integer.parseInt(scanner.nextLine()));
        
        System.out.println("Nhap dia chi People : ");
        setDiaChi(scanner.nextLine());
    }
}