/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT7;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Student extends Person{
    String rollno;
    int grade;;
    String email;

    Scanner input = new Scanner(System.in);

    @Override
    public void inputInfo() {
        super.inputInfo();
        
        System.out.printf("Nhap ma sinh vien: ");
        rollno = input.nextLine();
        
        System.out.printf("nhap diem: ");
        grade = Integer.parseInt(input.nextLine());
        
        System.out.printf("Nhap mail sinh vien: ");
        email = input.nextLine();
    }
    
    
    
    @Override
    public void showInfo() {
        super.showInfo();
        
        System.out.println("So la: " +rollno);
        System.out.println("Diem la: " +grade);
        System.out.println("Mail la: " +email);
    }
    
    public void schoolarship(int grade) {
        if (grade >8) System.out.println("Ban da nhan duoc hoc bong");
    }
}
