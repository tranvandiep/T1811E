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
public class Bai39Bai5SapXepMangTheoThuTuTangDan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.print("Nhap so nguyen N: ");
        N = input.nextInt();
        int[] Array = new int[N];
        int stt;
        int temp;
    
        for(int i = 0; i < N; i++){
            stt = i + 1;
            System.out.print("Nhap gia tri cho phan tu thu " + stt +": ");
            Array[i] = input.nextInt();
        };
        
        for(int j = 0; j < N-1; j++){
            for(int c = 0; c < N-1-j; c++){
                if(Array[c] < Array[c+1]){
                    temp = Array[c];
                    Array[c] = Array[c+1];
                    Array[c+1] = temp;
                };
            };    
        };
        
        System.out.println("Mang sau khi da sap xep la: ");
        
        for(int k = 0; k < N; k++){
            System.out.print(Array[k] + ", ");
        };
        
    };
}
