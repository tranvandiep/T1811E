/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap39.pkg1;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class BaiTap391 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        int a;
        for (int n=1;n <= 10;n++){
            System.out.printf("Nhap so %d : ",n);
            Scanner input=new Scanner(System.in);
            a = Integer.parseInt(input.nextLine());
            sum+=a;
        }
        System.out.printf("Sum= %d",sum);
    }
    
}
