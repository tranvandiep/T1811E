/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai522AssignmentKiemTra60Phut;
import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class People implements IInfor{
    Scanner z = new Scanner(System.in);
    
    private String Ten;
    private int Tuoi;
    private String DiaChi;

    public People(String Ten, int Tuoi, String DiaChi) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
    }
    
    public People(){
        
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    @Override
    public String toString() {
        return "People{" + "Ten=" + Ten + ", Tuoi=" + Tuoi + ", DiaChi=" + DiaChi + '}';
    }
    
    public void input(){
        System.out.print("- Nhập tên: ");
        this.Ten = z.nextLine();
        System.out.print("- Nhập tuổi: ");
        this.Tuoi = z.nextInt();
        z.nextLine();
        System.out.print("- Nhập địa chỉ: ");
        this.DiaChi = z.nextLine();
    }
    
    @Override
    public String showInfor(){
        return this.toString();
    }
}
