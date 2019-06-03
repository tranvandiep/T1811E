/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest5;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class JavaTest5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Nhập 1 số : ");
        n=Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.printf("Sum %d",sum);
    }
    
}
