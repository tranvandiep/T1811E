/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap43.pkg10;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class BaiTap4310 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Nhap mot so : ");
        n=Integer.parseInt(scanner.nextLine());
        if(n<=1){
            System.out.println(n+ "khong phai so nguyen to");    
        }
        else if(n==2){
            System.out.println(n+ "la so nguyen to");
        }
        else{
            int count = 0;
            for(int i=2;i<(n-1);i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count >0){
                System.out.println(n+ " khong phai so nguyen to ");
            }else{
                System.out.println(n+ " la so nguyen to "); 
            }
        }
    }
    
}
