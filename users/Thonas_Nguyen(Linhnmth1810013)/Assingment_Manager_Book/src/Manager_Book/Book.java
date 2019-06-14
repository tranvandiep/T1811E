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
public abstract class Book {
    String tenSach;
    String ngayXuatBan;
    String butDanh;

    public Book() {
    }

    public Book(String tenSach, String ngayXuatBan, String butDanh) {
        this.tenSach = tenSach;
        this.ngayXuatBan = ngayXuatBan;
        this.butDanh = butDanh;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(String ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public String getButDanh() {
        return butDanh;
    }

    public void setButDanh(String butDanh) {
        this.butDanh = butDanh;
    }
    public abstract void input();
    public abstract void display();
}
