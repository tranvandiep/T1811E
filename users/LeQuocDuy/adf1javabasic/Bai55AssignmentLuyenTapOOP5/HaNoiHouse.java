/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai55AssignmentLuyenTapOOP5;

/**
 *
 * @author Duy Lumiere
 */
public class HaNoiHouse extends House {

    private String tenQuan;

    public HaNoiHouse() {

    }

    public HaNoiHouse(String tenQuan, String soNha, String diaChi, String loaiNha) {
        super(soNha, diaChi, loaiNha);
        this.tenQuan = tenQuan;
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("- Nhập quận: ");
        this.tenQuan = in.nextLine();
        System.out.println("");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("- Quận: " + this.getTenQuan());
    }

    @Override
    public String toString() {
        return "Nha {" + "soNha=" + getSoNha() + ", diaChi=" + getDiaChi() + ", loaiNha=" + getLoaiNha() + ", tenQuan=" + tenQuan + '}';
    }

    

    
    
}
