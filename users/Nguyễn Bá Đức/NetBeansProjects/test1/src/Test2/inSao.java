/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;
import java.util.Scanner;
/**
 *
 * @author HP ENVY
 */
public class inSao {
    public static void main(String[] args) {
        int n;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so phan tu:");
        n = nhap.nextInt();
        for(int i =0; i < n; i++){
            for(int j =0; j< i+1; j++) {
            System.out.printf("*");
            } System.out.println("\n");         
        }     
    }
}
