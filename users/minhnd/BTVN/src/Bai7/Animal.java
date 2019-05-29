/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

/**
 *
 * @author Minh
 */
public abstract class Animal {

    String ten;
    int tuoi;
    String mota;

    public Animal() {
    }

    public Animal(String ten) {
        this.ten = ten;
    }

    public Animal(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public Animal(String ten, int tuoi, String mota) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.mota = mota;
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public void xemThongTin() {
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "Animal{" + "ten=" + ten + ", tuoi=" + tuoi + ", mota=" + mota + '}';
    }
    
    abstract void tiengKeu();

}
