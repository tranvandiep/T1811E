
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Bai1 {
   
    public int a;
   public int b;
    private int S;
    private int T;
    private int P;
    private int Q;
public void input(){
    Scanner input = new Scanner(System.in);
    System.out.println("nhap vao so a: ");
    a=input.nextInt();
    
    System.out.println("nhap vao so b: ");
    b=input.nextInt();
}   
public void cong(){
    S=a+b; 
    System.out.println("Tong 2 so: "+S);
}   
public void tru(){
       T = a-b;
    System.out.println("Hieu 2 so: "+T);
}
public void nhan(){
    P=a*b;
    System.out.println("Tich 2 so: "+P);
}
public void chia(){
    Q= a / b;
    System.out.println("Thuong 2 so: "+Q);
}
}
