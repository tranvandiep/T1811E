/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

/**
 *
 * @author PC
 */
import java.io.PrintStream;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap so thu 1: ");
        int num1 = input.nextInt();
        calculator.setNum1(num1);
        System.out.print("Nhap so thu 2: ");
        int num2 = input.nextInt();
        calculator.setNum2(num2);
        
        calculator.setSum(calculator.getNum1(), calculator.getNum2());
        System.out.printf("Tong hai so = %f\n", +calculator.getSum());
        
        calculator.setSubtract(calculator.getNum1(), calculator.getNum2());
        System.out.printf("Hieu hai so = %f\n", +calculator.getSubtract());
        
        calculator.setMultiply(calculator.getNum1(), calculator.getNum2());
        System.out.printf("Tich hai so = %f\n", +calculator.getMultiply());
        
        calculator.setDivision(calculator.getNum1(), calculator.getNum2());
        System.out.printf("Thuong hai so = %f\n", +calculator.getDivision());
    }
}
