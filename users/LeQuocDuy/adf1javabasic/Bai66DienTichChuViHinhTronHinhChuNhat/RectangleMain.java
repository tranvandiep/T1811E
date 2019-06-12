/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai66DienTichChuViHinhTronHinhChuNhat;
import java.util.Scanner;
/**
 *
 * @author Duy Lumiere
 */
public class RectangleMain {
                public static void main(String[] args){
                                Scanner in = new Scanner(System.in);
                                
                                Rectangle HCN = new Rectangle();
                                int a;
                                int b;
                                
                                System.out.print("Nhập chiều dài cho Hình chữ nhật: ");
                                a = in.nextInt();
                                HCN.RecWidInp(a);
                                
                                System.out.print("Nhập chiều rộng cho Hình chữ nhật: ");
                                b = in.nextInt();
                                HCN.RecHeiInp(b);
                                
                                System.out.println(HCN.RecHei + HCN.RecWid);
                                System.out.println("\nChu vi Hình chữ nhật là: " + HCN.RectanglePerimeter());
                                System.out.println("Diện tích Hình chữ nhật là: " + HCN.RectangleSquare());
                }
}
