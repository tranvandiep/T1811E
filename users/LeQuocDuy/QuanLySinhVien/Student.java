/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.QuanLySinhVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class Student extends Person implements Comparable<Student> {

    public static ArrayList<Student> listStudent = new ArrayList<Student>();

    public Student(String Ten, String GioiTinh, String NgaySinh, String DiaChi) {
        super(Ten, GioiTinh, NgaySinh, DiaChi);
        listStudent.add(this);
    }

    private String MaSinhVien;
    private float DiemTrungBinh;
    private String Email;

    public Student() {
        listStudent.add(this);
    }

    @Override
    public void inputinfo() {
        boolean flag = true;

        super.inputinfo();

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhap ma sinh vien: ");
            this.MaSinhVien = input.nextLine();

            if (this.MaSinhVien.length() != 8) {
                System.out.println("Mã sinh viên cần có 8 kí tự !!!");
                flag = false;
            } else {
                flag = true;
            }
        } while (flag == false);


        do {
            System.out.println("Nhap diem trung binh : ");
            this.DiemTrungBinh = Float.parseFloat(input.nextLine());

            if (this.DiemTrungBinh < 0 || this.DiemTrungBinh > 10) {
                System.out.println("Kiểm tra lại điểm !!!");
                flag = false;
            } else {
                flag = true;
            }
        } while (flag == false);
        do {
            System.out.println("Nhap email : ");
            this.Email = input.nextLine();

            if (this.Email.indexOf('@') == -1) {
                System.out.println("Kiểm tra lại định dạng Email !!!");
                flag = false;
            } else {
                flag = true;
            }
        } while (flag == false);

    }

    public static ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public static void setListStudent(ArrayList<Student> listStudent) {
        Student.listStudent = listStudent;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public float getDiemTrungBinh() {
        return DiemTrungBinh;
    }

    public void setDiemTrungBinh(float DiemTrungBinh) {
        this.DiemTrungBinh = DiemTrungBinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("Ma sinh vien : " + this.MaSinhVien);
        System.out.println("Diem trung binh :" + this.DiemTrungBinh);
        System.out.println("Email : " + this.Email);
    }

    @Override
//    Ghi đè phương thức conpareTo để sắp xếp theo tên trong mảng arrayList student
    
    public int compareTo(Student o) {
        return this.getTen().compareTo(o.getTen());
    }

}
