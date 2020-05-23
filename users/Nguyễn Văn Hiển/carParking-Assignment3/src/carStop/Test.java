/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carStop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import vehicle.Car;
import vehicle.Container;

/**
 *
 * @author PC
 */
public class Test {
    
    
    public static void main(String[] args) {
        Car car = new Car();
        Container con = new Container();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap chieu rong Area: ");
        int width = input.nextInt();
        System.out.print("Nhap chieu dai Area: ");
        int length = input.nextInt();
        
        int x;
        int y;
        int z;
        int Scar;
        int Scon;
        int S;
        int S1 = 0;
        int s1 = 0;
        int S2 = 0;
        int s2 = 0;
        List<int[][]> zone = new ArrayList<>();
        
        Scon = con.getConLeng()*con.getConWid();
        Scar = car.getCarLeng()*car.getCarWid();
        S = length*width;
        
        
        //Area co width lon la length nho
        if(((int)(length/con.getConWid())) == 1) {
            s1 = -2*length;
            s2 = -3*length;
            x = 1;
            
            y = (int)(width/(car.getCarLeng()+2));
            S2 = Scar*y+(y-1)*2*length;
            System.out.println(y);
            System.out.println(S2);
            
            z = (int)(width/(con.getConLeng()+3));
            
            //dien tat ca la xe car
            int[][] arr = new int[x][y];
            for(int i = 0; i < x; i++) {
                for(int j = 0; j < y; j++) {
                    arr[i][j] = Scar;
                    s1 = s1 + arr[i][j] + 2*length;
                }
            }
            
            for(int i = 0; i < x; i++) {
                for(int j = 0; j < y; j++) {
                    System.out.print(arr[i][j] +"   ");
                }
                System.out.print("\n");
            }

            //thay the dan bang xe con
            for(int i = 0; i < x; i++) {
                for(int j = 0; s2 < s1; j++) {
                    arr[i][j] = Scar + 9;
                    s2 = s2 + arr[i][j] + 4*length;
                    if(s2 > s1) {
                        arr[i][j] = Scar;
                    }
                }
            }
             
            for(int i = 0; i < x; i++) {
                for(int j = 0; j < y; j++) {
                    System.out.print(arr[i][j] +"   ");
                }
                System.out.print("\n");
            }      
        }
        
    }
}
