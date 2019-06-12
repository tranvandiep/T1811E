/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai55AssignmentLuyenTapOOP5;
import java.util.Scanner;
/**
 *
 * @author Duy Lumiere
 */
public class House implements IHouse{
    Scanner in = new Scanner(System.in);
    
    private String soNha;
    private String diaChi;
    private String loaiNha;
    
    public House(){
        
    }

    public House(String soNha, String diaChi, String loaiNha) {
        this.soNha = soNha;
        this.diaChi = diaChi;
        this.loaiNha = loaiNha;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    @Override
    public void input() {
        System.out.println("");
        System.out.println("NHẬP THÔNG TIN NHÀ: ");
        System.out.print("- Nhập Số nhà: ");
        this.soNha = in.nextLine();
        System.out.print("- Nhập Địa chỉ: ");
        this.diaChi = in.nextLine();
        System.out.print("- Nhập Loại nhà: ");
        this.loaiNha = in.nextLine();
    }

    @Override
    public void display() {
        System.out.println("");
        System.out.println("THÔNG TIN NHÀ: ");
        System.out.println("- Số nhà: " + this.getSoNha());
        System.out.println("- Địa chỉ: " + this.getDiaChi());
        System.out.println("- Loại nhà " + this.getLoaiNha());
    }

    @Override
    public String toString() {
        return "House{" + "soNha=" + soNha + ", diaChi=" + diaChi + ", loaiNha=" + loaiNha + '}';
    }

    
    
}
