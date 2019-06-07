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
public class Bai2 {

    public static void main(String[] args) {
        System.out.println("Bài 2 :\n"
                + "\n"
                + "Khai báo mảng số nguyên gồm N phần tử (N nhập từ bàn phím)\n"
                + "\n"
                + "Yêu cầu :\n"
                + "\n"
                + "- Nhập dữ liệu cho mảng trên\n"
                + "\n"
                + "- Tính tổng các phần tử chia hết cho 3 trong mảng và in ra màn hình kết quả.");
        int n,sum = 0;
        List<Integer> arrInt = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mang cua ban co bao nhieu phan tu?");
        n = Integer.parseInt(scanner.nextLine());
        
        while (n < 1) {            
            System.out.println("So phan tu cua mang khong duoc nho hon 0! Nhap lai : ");
            n = Integer.parseInt(scanner.nextLine());
        }
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao so nguyen thu %d cua mang", i+1);
            int x = Integer.parseInt(scanner.nextLine());
            arrInt.add(x);
            
            if (arrInt.get(i) % 3 == 0) {
                sum += arrInt.get(i);
            }
        }
        
        System.out.println("Tong cac phan tu chia het cho 3 cua mang la : " + sum);
    }
}
