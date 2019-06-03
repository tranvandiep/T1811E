/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Test1 {
    public String fullname;
    public int age;
    public String email;
    public String address;
    public String rollNo;
    
    public void learning(){
        System.out.println("I'm reading");
    }
    public void input(){
    Scanner input=new Scanner(System.in);
        System.out.println("nhap ten");
        fullname=input.nextLine();
        System.out.println("Nhap tuoi");
        age=Integer.parseInt(input.nextLine());
        System.out.println("Nhap email");
        email=input.nextLine();
        System.out.println("Nhap dia chi");
        address=input.nextLine();
        System.out.println("Nhap ma sv");
        rollNo=input.nextLine();
    }
}
    

