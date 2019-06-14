/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager_Book;

/**
 *
 * @author linhn
 */
public abstract class Author {
    String ten;
    int tuoi;
    String butDanh;
    String ngaySinh;
    String queQuan;

    public Author() {
    }

    public Author(String ten, int tuoi, String butDanh, String ngaySinh, String queQuan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.butDanh = butDanh;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
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

    public String getButDanh() {
        return butDanh;
    }

    public void setButDanh(String butDanh) {
        this.butDanh = butDanh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public abstract void  input();
    public abstract void display();
    
}
