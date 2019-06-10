/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentBai81;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author giangduy
 */
public class TacGia {
    private String ten;
    private int tuoi;
    private String butDanh;
    private String ngaySinh;
    private String queQuan;

    public TacGia() {
    }

    public TacGia(String butDanh) {
        this.butDanh = butDanh;
    }

    public TacGia(String ten, int tuoi, String butDanh, String ngaySinh, String queQuan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.butDanh = butDanh;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getButDanh() {
        return butDanh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ten tac gia: ");
        ten = input.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = Integer.parseInt(input.nextLine());
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = input.nextLine();
        System.out.println("Nhap que quan: ");
        queQuan = input.nextLine();
    }

    public void input(List<TacGia> tgList) {
        Scanner input = new Scanner(System.in);
        input();

        System.out.println("Nhap but danh: ");
        while (true) {
            butDanh = input.nextLine();
            boolean cache = false;
            for (int i = 0; i < tgList.size(); i++) {
                if (tgList.get(i).getButDanh().equalsIgnoreCase(butDanh)) {
                    cache = true;
                    break;
                }
            }
            if (cache) {
                System.err.println("Nhap but danh khac: ");
            }
        }

    }

    @Override
    public String toString() {
        return "TacGia{" + "ten=" + ten + ", tuoi=" + tuoi + ", butDanh=" + butDanh + ", ngaySinh=" + ngaySinh + ", queQuan=" + queQuan + '}';
    }

    public void display() {
        System.out.println(toString());
    }
}
