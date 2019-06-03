/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4311;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BaiTap4311 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        ArrayList<Integer> arrInt = new ArrayList<>();
        System.out.println("Nhap mot so : ");
        m = Integer.parseInt(scanner.nextLine());
        for (int n = 2; n <= m; n++) {
            if (n == 2) {
                arrInt.add(n);
            } else {
                int count = 0;
                for (int i = 2; i < (n - 1); i++) {
                    if (n % i == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    arrInt.add(n);
                }
            }
        }
        
        for (int i = 0; i < arrInt.size(); i++) {
            System.out.print(arrInt.get(i) + ", ");
        }
    }
}
