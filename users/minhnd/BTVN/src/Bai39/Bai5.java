/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai39;
import java.util.Scanner;
/**
 *
 * @author Minh
 */
public class Bai5 {
    public static void main(String[] args) {
        
        int N;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap so luong phan tu:");
        N = input.nextInt();
        
        int[] mang = new int[N];
        for(int i=0; i<N; i++){
            System.out.printf("Nhap so thu %d:", i+1);
            mang[i] = input.nextInt();
        }
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N-i-1; j++){
                if(mang[j]>mang[j+1]){
                    int cache = mang[j];
                    mang[j]=mang[j+1];
                    mang[j+1]=cache;
                }
            }
        }
                
        System.out.printf("Thu tu tang dan la:");
        for(int i=0; i<N; i++){
            System.out.printf("%d ", mang[i]);
        }
    }
}
