/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest1;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class JavaTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        int sum=0;
        for(int n=1;n<=10;n++){
            System.out.printf("Nhap so %d : ",n);
            a=Integer.parseInt(scanner.nextLine());
            sum+=a;
        }
        System.out.printf("sum = %d,",sum);
    }
    
}
