/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Scanner;
/**
 *
 * @author HP ENVY
 */
public class Student {
    public String fullName;
    public int age;
    public void learning() {
        System.out.println("Hello motherfucker....");
    }
    public void input() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhap ten: ");
        fullName = input.nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.parseInt(input.nextLine());
     
    }
    public void display() {
        System.out.println("Ten: " + fullName);
    }
    
    public void Student(String fullName) {
        this.fullName = fullName;
    }
}
