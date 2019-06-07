/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Bai4 {

    public static void main(String[] args) {
        System.out.println("Cho biểu thức Fibonaci như sau\n"
                + "\n"
                + "F(0) = 1\n"
                + "\n"
                + "F(1) = 1\n"
                + "\n"
                + "F(n) = F(n-1) + F(n-2)\n"
                + "\n"
                + "Nhập từ bản phím số max. In ra tất cả các số Fibonaci có giá trị nhỏ hơn max.\n"
                + "\n"
                + "Bài 5 :\n"
                + "\n"
                + "Khai báo mảng gồm N số nguyên (N nhập từ bàn phím)\n"
                + "\n"
                + "Sắp xếp mảng theo thứ tự tăng dần. và in mảng ra màn hình.");

        int max, temp;
        int numberFist, numberLast;
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrFibonaci = new ArrayList<>();
        
// Nhap 2 gia tri khoi dong F(0), F(1) cua chuoi Finonanci
        arrFibonaci.add(1);
        arrFibonaci.add(1);
        
//  Nhap gioi han cua chuoi Fibonanci
        do {
            System.out.println("Nhap vao gioi han 'max' cua chuoi Fibonaci : ");
            max = Integer.parseInt(scanner.nextLine());
        } while (max < 1);

//  Logic thuat toan xu ly
        do {
            numberFist = arrFibonaci.get(arrFibonaci.size() - 2);
            numberLast = arrFibonaci.get(arrFibonaci.size() - 1);
            temp = numberFist + numberLast;
            if (numberLast < max) {
                arrFibonaci.add(temp);
            }
        } while (temp < max);
        
//  In ra man hinh chuoi Fibonanci
        for (int i = 0; i < arrFibonaci.size(); i++) {
            System.out.print(arrFibonaci.get(i) + ", ");
        }
    }
}
