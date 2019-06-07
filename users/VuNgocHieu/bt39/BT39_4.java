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
public class BT39_4 {
    public static void main(String[] args) {  
    Scanner a = new Scanner(System.in);
    int n1=1,n2=1,n3,i,n; 
    System.out.println("nhap max");
    n = a.nextInt(); 
    System.out.print(n1+" "+n2);//in san so 1 va 1  
  
     for(i=2;i<n;++i)//lap tu 2 vi 1 va 1 da duoc in  
    {  
     n3=n1+n2;  
     System.out.print(" "+n3);  
     n1=n2;  
     n2=n3;  
    }  
    }
}
