/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.buoi2.ThucHanhBuoi2;

import java.util.Scanner;


/**
 *
 * @author LQT
 */
public class Calculator {
    Scanner input = new Scanner(System.in);
    
    public int number1;
    public int number2;
    
    public Calculator() {
    }
    
    public Calculator (int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    
    public int resultSum(){
        return number1 + number2;
    }
    
    public int resultSub(){
        return number1 - number2;
    }
    
    
    public int resultMul(){
        return number1 * number2;
    }
    
    public int resultDiv(){
        return number1 / number2;
    }
    
    public void inputNumber(){
        
        System.out.println("Nhap so thu nhat : ");
        number1 = Integer.parseInt(input.nextLine());
        System.out.println("Nhap vao so thu hai : ");
        number2 = Integer.parseInt(input.nextLine());
    }
    
     
}
