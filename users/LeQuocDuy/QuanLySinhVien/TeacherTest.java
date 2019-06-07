/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.QuanLySinhVien;

import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class TeacherTest {

    static void showMenu() {
        System.out.println("===============================");
        System.out.println("1. Nhap vao n giang vien ");
        System.out.println("2. Hien thi thong tin tat ca giang vien ");
        System.out.println("3. Hien thi giang vien co luong cao nhat ");
        System.out.println("4. Thoat ");
        System.out.println("===============================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            showMenu();
            System.out.println("Moi ban chon 1 muc : ");
            luaChon = scanner.nextInt();
            int sizeGv;
            switch (luaChon) {
                case 1:
                    System.out.println("== Thêm giang viên mới == ");
                    System.out.println("Nhap vao so luong giang vien : ");
                    sizeGv = scanner.nextInt();

                    for (int i = 1; i <= sizeGv; i++) {
                        System.out.println("Nhap thong tin giang vien thu " + i);
                        Teacher teacher = new Teacher();
                        teacher.inputinfo();
                    }
                    break;

                case 2:
                    System.out.println("== Hien thi thong tin tat ca cac giang vien ra man hinh ==");
                    for (Teacher a : Teacher.listTeacher) {
                        a.showinfo();
                    }
                    break;

                case 3:
                    System.out.println("== Hien thi giang vien co luong cao nhat ==");
                    Teacher luongMax = null;
                    for (int i = 0; i < Teacher.listTeacher.size(); i++) {
                        if (luongMax == null || Teacher.listTeacher.get(i).luongThucNhan() >= luongMax.luongThucNhan()) {
                            luongMax = Teacher.listTeacher.get(i);
                        }
                        luongMax.showinfo();
                    }
                case 4:
                    System.out.println("== Thoat chuong trinh ==");
                    break;
            }
        } while (luaChon != 4);
    }
}
