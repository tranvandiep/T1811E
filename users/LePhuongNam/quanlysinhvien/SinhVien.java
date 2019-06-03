/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

/**
 *
 * @author hlamg
 */
public class SinhVien {
    String ten;
    int tuoi;
    String diaChi;
    String email;
    String soDienThoai;

    public SinhVien() {
    }

    public SinhVien(String ten, int tuoi, String diaChi, String email, String soDienThoai) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }
    
    public void inSinhVien(){
        System.out.printf("%s, %d, %s, %s, %s", this.ten,this.tuoi,this.diaChi,this.email,this.soDienThoai);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    
    
}
