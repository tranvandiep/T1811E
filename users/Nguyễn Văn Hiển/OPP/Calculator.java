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
public class Calculator {
    double num1;
    double num2;
    double sum;
    double subtract;
    double multiply;
    double division;
    
    public Calculator() {
        
    }
    
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }    
    public void setSum(double num1, double num2) {
        this.sum = num1 + num2;
    }
    public void setSubtract(double num1, double num2) {
        this.subtract = num1 - num2;
    }
    public void setMultiply(double num1, double num2) {
        this.multiply = num1*num2;
    }
    public void setDivision(double num1, double num2) {
        this.division = num1/num2;
    }
    
    
    public double getNum1() {
        return num1;
    }
    public double getNum2() {
        return num2;
    }
    public double getSum() {
        return sum;
    }
    public double getSubtract() {
        return subtract;
    }
    public double getMultiply() {
        return multiply;
    }
    public double getDivision() {
        return division;
    }
}
