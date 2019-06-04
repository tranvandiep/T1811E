/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class HinhChuNhat {
    public int chieudai;
    public int chieurong;
    
    public void input_chieudai(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap thong tin chieu dai: ");
        chieudai = Integer.parseInt(input.nextLine());
    }
    
    public void input_chieurong(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap thong tin chieu rong: ");
        chieurong = Integer.parseInt(input.nextLine());
    }
    
    public void chuvi(){
        int x;
        x = (chieudai + chieurong)*2;
        System.out.printf("Chu vi hinh chu nhat la: %d\n",x);
    }
    
    public void dientich(){
        int y;
        y = chieudai * chieurong;
        System.out.printf("Dien tich hinh chu nhat la: %d\n", y);
    }
}
