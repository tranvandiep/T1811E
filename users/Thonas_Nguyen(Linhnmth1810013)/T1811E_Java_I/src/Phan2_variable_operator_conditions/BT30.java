/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan2_variable_operator_conditions;

import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class BT30 {
    public static void main(String[] args) {
/*Practice 1:
        int varA;
        int varB;
        int varX;
        Scanner input = new Scanner(System.in);
        System.out.printf("variable a =");
        varA = Integer.parseInt(input.nextLine());
        System.out.printf("variable b =");
        varB = Integer.parseInt(input.nextLine());
        if(varA != 0){
            varX = - (varB / varA);
            System.out.println("The equation has a unique solution:" + varX);           
        } else
            if( varB == 0){
                System.out.println("The equation have many solution");
            } else
                System.out.println("The equation haven't solution");
 ---------------------------------------------*/
/*Practice 2:    
        int x;
        Scanner input = new Scanner(System.in);
        System.out.printf("Input a number:");
        x = Integer.parseInt(input.nextLine());
        if( (x%2) == 1){
            System.out.println("The number input is odd number");
        } else
            System.out.println("The number input is even number");
 -----------------------------------------------*/  

        String name;
        int age;
        String adres;
        String email;
        String phone;
        Scanner input = new Scanner(System.in);
        System.out.printf("Input student name:");
        name = input.nextLine();
        System.out.printf("Input student age:");
        age = Integer.parseInt(input.nextLine());
        System.out.printf("Input student adres:");
        adres = input.nextLine();
        System.out.printf("Input student email:");
        email = input.nextLine();
        System.out.printf("Input student phone:");
        phone = input.nextLine();
        System.out.println("The student name:"+name);
        System.out.println("The student name:"+age);
        System.out.println("The student name:"+adres);
        System.out.println("The student name:"+email);
        System.out.println("The student name:"+phone);
    }  
}
