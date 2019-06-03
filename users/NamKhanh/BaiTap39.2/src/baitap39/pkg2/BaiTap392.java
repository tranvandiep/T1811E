/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap39.pkg2;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class BaiTap392 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n;
       int a;
       int sum=0;
        System.out.printf("Nhap so : ");
        Scanner input=new Scanner(System.in);
        n = Integer.parseInt(input.nextLine());
        int A[]=new int[n];
        for(int i=1;i<=n;i++){
        System.out.printf("Nhap so %d : ",i);
        a=Integer.parseInt(input.nextLine());   
        if(a % 3 == 0 ){
            sum+=a;
        }
        }
        System.out.printf("Sum : %d ", sum);
    }
    
}
