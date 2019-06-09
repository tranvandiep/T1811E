/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT43;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dem =0;
        long n;
        
        System.out.printf("Nhap so n: ");
        n = Long.parseLong(input.nextLine());
        
        for (int i =1; i <=n; i ++) {
            dem += i;
        }
        
        System.out.println(dem);
    }
}
