/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exjava1;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ExJava1 {

    /**
     * @param args the command line arguments
     */
   public String Ten;
   public int Tuoi;
   public int Dienthoai;
   public String Diachi;
   public String Lop;
   
   public void NhapThongTin(){
       Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap tên:");
        Ten=scanner.nextLine();
        System.out.println("Nhap tuổi:");
        Tuoi=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Số điện thoại:");
        Dienthoai=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap địa chỉ:");
        Diachi=scanner.nextLine();
        System.out.println("Lớp:");
        Lop=scanner.nextLine();
   }
   public void InThongTin(){
        System.out.println("Tên sv la: "+Ten);
        System.out.println("Tuổi là: "+Tuoi);
        System.out.println("Số điện thoại la: "+Dienthoai);
        System.out.println("Địa chỉ là: "+Diachi);
        System.out.println("Lớp là: "+Lop);
   }

    public static void main(String[] args) {
        ExJava1 ex=new ExJava1();
        ex.NhapThongTin();
        ex.InThongTin();
    }
   }