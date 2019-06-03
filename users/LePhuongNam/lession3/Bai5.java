/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Bai5 {

    public static void main(String[] args) {
        System.out.println("Bài 5 :\n"
                + "\n"
                + "Khai báo mảng gồm N số nguyên (N nhập từ bàn phím)\n"
                + "\n"
                + "Sắp xếp mảng theo thứ tự tăng dần. và in mảng ra màn hình.");
        
        int n, temp;
        List<Integer> arrInt = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mang so nguyen co bao nhieu phan tu ? ");
        n = Integer.parseInt(scanner.nextLine());
        
        while (n < 1) {            
            System.out.println("So phan tu cua mang khong duoc < 0! Nhap lai : ");
            n = Integer.parseInt(scanner.nextLine());
        }
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao so thu %d cua mang : ", i+1);
            temp = Integer.parseInt(scanner.nextLine());
            arrInt.add(temp);
        }
        
        Collections.sort(arrInt);
        System.out.println(arrInt);
    }
}
