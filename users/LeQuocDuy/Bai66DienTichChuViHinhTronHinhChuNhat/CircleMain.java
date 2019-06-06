/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai66DienTichChuViHinhTronHinhChuNhat;

import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class CircleMain {
            public static void main(String[] args){
                        Scanner in = new Scanner(System.in);
                        Circle hinhtron = new Circle();
                        hinhtron.getPI();
                        float RadInput;
                        
                        System.out.print("Nhập bán kính cho hình tròn là: ");
                        RadInput = in.nextFloat();
                                
                        hinhtron.InputRad(RadInput);
                        System.out.println("Chu vi hình tròn là: " + hinhtron.CirclePerimeter());
                        System.out.println("Diện tích hình tròn là: " + hinhtron.CircleSquare());   
            }
}
