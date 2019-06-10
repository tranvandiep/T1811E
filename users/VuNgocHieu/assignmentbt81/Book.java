/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentbt81;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Book {
    String tensach,butdanh;
    int ngayxuatban;

    public Book() {
    }

    public Book(String tensach, String butdanh, int ngayxuatban) {
        this.tensach = tensach;
        this.butdanh = butdanh;
        this.ngayxuatban = ngayxuatban;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }


    public String getButdanh() {
        return butdanh;
    }

   
    public void setButdanh(String butdanh) {
        this.butdanh = butdanh;
    }

    public int getNgayxuatban() {
        return ngayxuatban;
    }

    public void setNgayxuatban(int ngayxuatban) {
        this.ngayxuatban = ngayxuatban;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ten sach: ");
        tensach = input.nextLine();
        System.out.println("nhap ngay xuat ban: ");
        ngayxuatban = Integer.parseInt(input.nextLine());
        System.out.println("nhap but danh: ");
        butdanh = input.nextLine();
    }

    
//    public String display() {
//        return "book{" + "tensach=" + tensach + ", butdanh=" + butdanh + ", ngayxuatban=" + ngayxuatban + '}';
//    }
//    
    public void display() {
        System.out.println("--");
        System.out.println("Ten sach: " + tensach);
        System.out.println("But danh: " + butdanh);
        System.out.println("Ngay xuat ban: " + ngayxuatban);
    }
}
