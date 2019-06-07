/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT39;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class BT39_5 {
    public static void main(String[] args) {
        Scanner nhapmang = new Scanner(System.in);
        int n;
        int[] a = new int[100];
        System.out.println("nhap so phan tu cua mang: ");
        n = nhapmang.nextInt();
        
        Scanner phantu = new Scanner(System.in);
        for(int i=1;i<=n;i++) {
            System.out.printf("nhap so nguyen thu %d: ",i);
            a[i] = phantu.nextInt();
        }
        
        int temp;
        for(int i=1;i<=n;i++) {
            for(int j=i+1;j<=n;j++) {
                if(a[i]>a[j]) {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        
        System.out.printf("Mang sau khi xep theo thu tu tang dan la: ");
        for(int i=1;i<=n;i++) {
            System.out.printf("\t%d",a[i]);
        }
    }
}

