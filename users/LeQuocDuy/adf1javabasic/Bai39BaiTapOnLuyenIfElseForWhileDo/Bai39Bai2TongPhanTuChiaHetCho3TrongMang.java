/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai39BaiTapOnLuyenIfElseForWhileDo;

import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class Bai39Bai2TongPhanTuChiaHetCho3TrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.println("Input array size: ");
        N = Integer.parseInt(input.nextLine());
        int[] Array = new int[N];
        int Sum = 0;
        int Stt;
        for(int i = 0; i < N; i++){
            Stt = i + 1;
            System.out.println("Nhap phan tu thu " + Stt + ":");
            Array[i] = Integer.parseInt(input.nextLine());
            if((Array[i]%3)==0){
                Sum = Sum + Array[i];
            };
        };
        System.out.println("Tong cua tat ca cac phan tu chia het cho 3 la: " + Sum);
    }
}
