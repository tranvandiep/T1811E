/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest2;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class JavaTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        int n;
        int sum=0;
        System.out.printf("Nhap so : ");
        n=Integer.parseInt(scanner.nextLine());
        int A[]=new int[n];
        for(int i=1;i<=n;i++){
            System.out.printf("Nhap so %d : ",i);
        a=Integer.parseInt(scanner.nextLine());
        if(a % 3 ==0){
            sum+=a;
        }
        }
        System.out.printf("Sum = %d",sum);
    }
    
}
