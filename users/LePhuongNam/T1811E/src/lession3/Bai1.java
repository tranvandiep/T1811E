/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession3;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Bai1 {

    public static void main(String[] args) {
        int[] arrInt = new int[10];
        int sum = 0;

        System.out.println("Bài 1 : \n"
                + "\n"
                + "Khai báo mảng số nguyên gồm 10 phần tử.\n"
                + "\n"
                + "Yêu cầu :\n"
                + "\n"
                + "- Nhập giá trị cho mảng đó\n"
                + "\n"
                + "- Tính tổng giá trị các phần tử trong mảng và in ra màn hình");
        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Nhap so nguyen thu %d vao mang : ", i+1);
            arrInt[i] = Integer.parseInt(scanner.nextLine());
            sum += arrInt[i];
        }
        
        System.out.println("Tong gia tri cac phan tu trong mang la : " + sum);
    }
}
