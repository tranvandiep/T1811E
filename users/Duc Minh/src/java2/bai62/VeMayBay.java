/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.bai62;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Minh
 */
public class VeMayBay implements Serializable {

    String maChuyenBay;
    String tenChuyenBay;
    String ngayBay;
    String hanhLy;
    int giaVe;

    public VeMayBay() {
    }

    public VeMayBay(String maChuyenBay, String tenChuyenBay, String ngayBay, String hanhLy, int giaVe) {
        this.maChuyenBay = maChuyenBay;
        this.tenChuyenBay = tenChuyenBay;
        this.ngayBay = ngayBay;
        this.hanhLy = hanhLy;
        this.giaVe = giaVe;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public String getTenChuyenBay() {
        return tenChuyenBay;
    }

    public void setTenChuyenBay(String tenChuyenBay) {
        this.tenChuyenBay = tenChuyenBay;
    }

    public String getNgayBay() {
        return ngayBay;
    }

    public void setNgayBay(String ngayBay) {
        this.ngayBay = ngayBay;
    }

    public String getHanhLy() {
        return hanhLy;
    }

    public void setHanhLy(String hanhLy) {
        this.hanhLy = hanhLy;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ma chuyen bay: ");
        while (true) {
            maChuyenBay = input.nextLine();
            String pattern = "";
            if (maChuyenBay.startsWith("VJ")) {
                pattern = "VJ[1-9]{1}[0-9]{2}";
            } else if (maChuyenBay.startsWith("VN")) {
                pattern = "VN[1-9]{1}[0-9]{2}[0-9]?";
            } else if (maChuyenBay.startsWith("JET")) {
                pattern = "JET[1-9]{1}[0-9]{2}";
            } else {
                System.err.println("Nhap lai: ");
                continue;
            }

            Pattern patternCheck = Pattern.compile(pattern);
            Matcher matcher = patternCheck.matcher(maChuyenBay);

            if (matcher.find()) {
                break;
            } else {
                System.err.println("Nhap lai: ");
            }
        }

        System.out.println("Nhap ten chuyen bay: ");
        tenChuyenBay = input.nextLine();

        System.out.println("Nhap ngay bay: ");
        ngayBay = input.nextLine();

        System.out.println("Nhap hanh ly: ");
        hanhLy = input.nextLine();

        System.out.println("Nhap gia ve: ");
        giaVe = Integer.parseInt(input.nextLine());
    }

    @Override
    public String toString() {
        return "VeMayBay{" + "maChuyenBay=" + maChuyenBay + ", tenChuyenBay=" + tenChuyenBay + ", ngayBay=" + ngayBay + ", hanhLy=" + hanhLy + ", giaVe=" + giaVe + '}';
    }

    public void dishplay() {
        System.out.println(toString());
    }

}
