/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap393;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BaiTap393 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        String a="";
        System.out.printf("Nhap mot so : ");
        Scanner input=new Scanner(System.in);
        n = Integer.parseInt(input.nextLine());
        for(int i=1;i<=n;i++){
            a+="*";
        System.out.printf("%s\n", a);    
        }
    }
    
}
