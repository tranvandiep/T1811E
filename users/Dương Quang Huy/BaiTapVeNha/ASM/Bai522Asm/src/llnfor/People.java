/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llnfor;

import java.util.Scanner;

/**
 *
 * @author DuongQuangHuy
 */
public class People implements IInfor {
    String Ten;
    int    tuoi;
    String diaChi;

    public People() {
    }

    public People(String Ten, int tuoi, String diaChi) {
        this.Ten = Ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
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

    @Override
    public void input() {
       Scanner input = new Scanner(System.in);
       
        System.out.println("nhap ten : ");
        Ten = input.nextLine();
        System.out.println("nhap tuoi : ");
        tuoi = Integer.parseInt(input.nextLine());
        System.out.println("nhap dia chi : ");
        diaChi = input.nextLine();
    }

    @Override
    public void showInfor() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "People{" + "Ten=" + Ten + ", tuoi=" + tuoi + ", diaChi=" + diaChi + '}';
    }

  
    
    
}
