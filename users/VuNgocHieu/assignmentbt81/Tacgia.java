/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentbt81;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tacgia {
    String ten,butdanh,quequan;
    int tuoi,ngaysinh;
    public Tacgia() {
    }

    public Tacgia(String butdanh) {
        this.butdanh = butdanh;
    }
    
    public Tacgia(String ten, int tuoi, String butdanh, int ngaysinh, String quequan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.butdanh = butdanh;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getButdanh() {
        return butdanh;
    }

    public int getNgaysinh() {
        return ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }
    
    public void input(List<Tacgia> tacgiaList){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ten: ");
        ten = input.nextLine();
        System.out.println("nhap tuoi: ");
        tuoi = Integer.parseInt(input.nextLine());
        System.out.println("nhap but danh: ");
        while (true) {
            butdanh = input.nextLine();
            boolean isFind = false;
            for (int i = 0 ; i < tacgiaList.size(); i++ ) {
                if( tacgiaList.get(i).getButdanh().equalsIgnoreCase(butdanh)) {
                    isFind = true;
                }
            }
            if (!isFind) { 
                break;
            } else {
                System.err.println("but danh bi trung lap, moi nhap but danh khac: ");
            }    
        }
        System.out.println("nhap ngay sinh: ");
        ngaysinh = Integer.parseInt(input.nextLine());
        System.out.println("nhap que quan: ");
        quequan = input.nextLine();
    }
    
    public void input (){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ten: ");
        ten = input.nextLine();
        System.out.println("nhap tuoi: ");
        tuoi = Integer.parseInt(input.nextLine());
        System.out.println("nhap ngay sinh: ");
        ngaysinh = Integer.parseInt(input.nextLine());
        System.out.println("nhap que quan: ");
        quequan = input.nextLine();
    }
    
    @Override
    public String toString() {
        return "tacgia{" + "ten=" + ten + ", butdanh=" + butdanh + ", quequan=" + quequan + ", tuoi=" + tuoi + ", ngaysinh=" + ngaysinh + '}';
    }
     public void display() {
         System.out.println(toString());
     }
}
