/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai65TaoMayTinhCoBanOOP;

/**
 *
 * @author Duy Lumiere
 */
public class Bai65Calculator {
    
    public static void main(String[] args){
        
        Calculator MayTinh = new Calculator();
        
        int a = MayTinh.Add(4,6);
        int b = MayTinh.Sub(10,2);
        int c = MayTinh.Mul(5, 6);
        float d = MayTinh.Div(9, 3);
        
        System.out.println("Gia tri cua 'a' la: " + a);
        System.out.println("Gia tri cua 'b' la: " + b);
        System.out.println("Gia tri cua 'c' la: " + c);
        System.out.println("Gia tri cua 'd' la: " + d);
        
    };
}
