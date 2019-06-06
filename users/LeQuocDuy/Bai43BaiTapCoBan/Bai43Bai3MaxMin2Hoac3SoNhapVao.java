/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai43BaiTapCoBan;

import java.util.Scanner;

/**
 *
 * @author Duy Lumiere
 */
public class Bai43Bai3MaxMin2Hoac3SoNhapVao {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int Selection;
        int Number1, Number2;
        int[] Array = new int[3];
        int temp;
        
        System.out.println("1. Tim max/min cho 2 so");
        System.out.println("2. Tim max/min cho 3 so");
        System.out.print("Lua chon cua ban: ");
        Selection = in.nextInt();
        
        switch(Selection){
            case 1:
                System.out.print("\n- Nhap so thu nhat: ");
                Number1 = in.nextInt();
                System.out.print("\n- Nhap so thu hai: ");
                Number2 = in.nextInt();
                
                if(Compare(Number1,Number2)==-1){
                    System.out.printf("\nMin: (%d); Max: (%d)",Number1,Number2);
                }
                else if(Compare(Number1,Number2)==0){
                    System.out.printf("\nKhong co Max, Min! Hai so bang nhau!");
                    System.out.println("\nMin = Max = " + Number1);
                }
                else{
                    System.out.printf("\nMax: (%d); Min: (%d)",Number1,Number2);
                }
                
                break;
            
            case 2:
                System.out.print("\n- Nhap so thu nhat: ");
                Array[0] = in.nextInt();
                System.out.print("\n- Nhap so thu hai: ");
                Array[1] = in.nextInt();
                System.out.print("\n- Nhap so thu ba: ");
                Array[2] = in.nextInt();
                
                for(int j=0; j<2; j++){
                    for(int i=0; i<2-j;  i++){
                        if(Array[i]>Array[i+1]){
                            temp = Array[i];
                            Array[i] = Array[i+1];
                            Array[i+1] = temp;
                        };
                    };
                };
                System.out.println("Max: " + Array[2]);
                System.out.println("Min: " + Array[0]);
                
                break;
                
            default:
                System.out.println("Vui long chon dung 1 trong 2 lua chon!");
                break;
                
        };
    }
    
    public static int Compare(int a, int b){
        if(a>b){
            return 1;
        }
        else if(a==b){
            return 0;
        }
        else{
            return -1;
        }
    };
}
