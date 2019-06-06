/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT65;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
    int a,b;
    Scanner input = new Scanner(System.in);
    System.out.println("Nhap tham so a va b la 2 so nguyen");
    a = Integer.parseInt(input.nextLine());
    b = Integer.parseInt(input.nextLine());
    System.out.printf("Ban vua nhap 2 tham so la %d va %d\n",a,b);
    Calculator pheptoan;
    pheptoan = new Calculator();
    pheptoan.cong(a,b);
    pheptoan.tru(a,b);
    pheptoan.nhan(a,b);
    pheptoan.chia(a,b);
    }
}  
