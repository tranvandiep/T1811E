/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest3;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JavaTest3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        String a="";
        System.out.printf("Nhap mot so : ");
        n=Integer.parseInt(input.nextLine());
        for(int i=1;i<=n;i++){
            a+='*';
            System.out.printf("%s\n",a);
        }
        
    }
    
}
