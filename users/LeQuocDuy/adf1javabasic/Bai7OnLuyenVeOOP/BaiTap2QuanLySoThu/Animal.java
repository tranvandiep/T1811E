/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai7OnLuyenVeOOP.BaiTap2QuanLySoThu;

/**
 *
 * @author Duy Lumiere
 */
public abstract class Animal {
    String Ten;
    int Tuoi;
    String MoTa;
    
    public void XemThongTin(){
        this.toString();
    }
    
    public Animal(){};

    public Animal(String Ten) {
        this.Ten = Ten;
    }

    public Animal(String Ten, int Tuoi) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
    }

    public Animal(String Ten, int Tuoi, String MoTa) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.MoTa = MoTa;
    }

    @Override
    public String toString() {
        return "Animal{" + "Ten=" + Ten + ", Tuoi=" + Tuoi + ", MoTa=" + MoTa + '}';
    }
    
    abstract void TiengKeu();
}
