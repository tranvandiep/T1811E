/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork3;

import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class Circle {
    int R;
    float C;
    float PI;
    float S;
    
    public Circle (){
    }
    public Circle (int R){
        this.R = R;
    }
   
    public void input() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ban kinh hinh tron : ");
        R = Integer.parseInt(input.nextLine());
    }
    
    
     public void display() {
        PI = (float) Math.PI;
        S = PI*R*R;
        C = 2*PI*R;
        System.err.println("Hang so PI: " + PI);
        System.out.println("Chu vi hinh tron: " + C);
        System.out.println("Dien tich hinh tron: " + S);
    }
}