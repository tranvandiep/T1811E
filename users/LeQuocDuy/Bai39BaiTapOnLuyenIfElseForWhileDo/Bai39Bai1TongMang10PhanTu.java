/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai39BaiTapOnLuyenIfElseForWhileDo;

import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class Bai39Bai1TongMang10PhanTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Array = new int[10];
        int tong = 0;
        
        for(int i = 1; i <=10; i++){
            System.out.println("Nhap gia tri cho phan tu thu "+ i +": ");
            Array[i-1] = Integer.parseInt(input.nextLine());
            tong = tong + Array[i-1];
        };
        System.out.printf("Tong cua mang la: " + tong);
    }
}
