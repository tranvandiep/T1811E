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
public class Car implements IInfor{
    Scanner z = new Scanner(System.in);
    
    private String Ten;
    private String Mau;

    public Car(String Ten, String Mau) {
        this.Ten = Ten;
        this.Mau = Mau;
    }
    
    public Car(){
        
    }

    public Scanner getZ() {
        return z;
    }

    public void setZ(Scanner z) {
        this.z = z;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }

    @Override
    public String toString() {
        return "Car{" + "Ten=" + Ten + ", Mau=" + Mau + '}';
    }
    
    public void input(){
        System.out.print("- Nhập tên xe: ");
        this.Ten = z.nextLine();
        System.out.print("- Nhập màu xe: ");
        this.Mau = z.nextLine();
    }
    
    @Override
    public String showInfor(){
        return this.toString();
    }
}
