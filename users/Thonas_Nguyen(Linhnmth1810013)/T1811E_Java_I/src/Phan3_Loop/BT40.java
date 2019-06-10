/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan3_Loop;

import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class BT40 {
    public static void main(String[] args) {
        int p;
        BT40_student_obj std = new BT40_student_obj();
        Scanner input = new Scanner(System.in);
        do{
            showMenu();
            p = Integer.parseInt(input.nextLine());
            switch(p){
                case 1:
                    System.out.printf("The student name is: ");
                    std.fullName = input.nextLine();
                    System.out.printf("Student age: ");
                    std.age = Integer.parseInt(input.nextLine());
                    System.out.printf("Address of student: ");
                    std.address = input.nextLine();
                    System.out.printf("Emai of student: ");
                    std.email = input.nextLine();
                    System.out.printf("Phone of student: ");
                    std.phone = Integer.parseInt(input.nextLine());
                    break;
                case 2:
                    System.out.println("Student: " + std.fullName);
                    System.out.println("Age: " + std.age);
                    System.out.println("Address: " + std.address);
                    System.out.println("Email: " + std.email);
                    System.out.println("Phone: " + std.phone);
                    break;
            }
        } while (p == 1 || p == 2);
    }
    
    public static void showMenu(){
        System.out.println("-----------Menu--------------------");
        System.out.println("1.Input student information");
        System.out.println("2.Print student information");
        System.out.println("3.Exit");
        System.out.println("-----------------------------------");
        System.out.printf("Please choose: ");
    }
 
}
