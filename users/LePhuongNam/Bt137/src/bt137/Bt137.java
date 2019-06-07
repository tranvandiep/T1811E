/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt137;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Bt137 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int sumAll = 0;
        int sumArr3 = 0;
        List<Integer> arrInt = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap vao so phan tu cua mang : ");
        n = Integer.parseInt(scanner.nextLine());
        
        while (n < 1) {            
            System.err.println("Nhap lai : ");
            n = Integer.parseInt(scanner.nextLine());
        }
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao so thu %d : ", i+1);
            arrInt.add(i);
            sumAll += arrInt.get(i);
            if(arrInt.get(i) % 3 == 0){
                sumArr3 += arrInt.get(i);
            }
        }
        
        System.out.println("Tong cac so trong mang la : " + sumAll);
        System.out.println("Tong cac so chia het cho 3 cua mang la : " + sumArr3);
    }
    
}
