/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

/**
 *
 * @author HP ENVY
 */
public class Student extends Person {

    String maSv;
    Float diemSo;
    String email;

    public Student() {
    }

    public Student(String maSv, Float diemSo, String email) {
        this.maSv = maSv;
        this.diemSo = diemSo;
        this.email = email;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public Float getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(Float diemSo) {
        this.diemSo = diemSo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inputInfo() {
        super.inputInfo();

        do {
            if (maSv.matches("\\S{8}")) {
                System.out.println("Nhap ma sinh vien");
            }
            maSv = inputInfo.nextLine();

        } while (!maSv.matches("\\S{8}"));
        {

        }
        do {
            System.out.println("Nhap diem so:");
            diemSo = inputInfo.nextFloat();

        } while ((diemSo < 0.0f) || (diemSo > 10.0f));
        do {
            System.out.println("Nhap email: ");
            email = inputInfo.nextLine();
        } while (!email.matches("\\S+@\\S+\\.\\w+\\.*\\w+"));

    }

    public void hocbong() {
        if (diemSo > 8) {
            System.out.println("Sinh vien du dieu kien nhan hoc bong!");

        } else {
            System.out.println("Sinh vien ko du dieu kien nhan hoc bong!");
        }
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Ma sinh vien:" + maSv);
        System.out.println("Diem so: " + diemSo);
        System.out.println("Email: " + email);
    }

}
