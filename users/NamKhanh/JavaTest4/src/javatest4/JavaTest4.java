/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest4;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class JavaTest4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=100;i++){
            sum=sum+i;
        }
        System.out.printf("Sum= %d ", sum);
    }
    
}
