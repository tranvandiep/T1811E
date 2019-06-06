/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT65;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Calculator {
    public void cong(int a,int b) {  
        System.out.printf("Ket qua: %d + %d = %d\n", a, b, a + b);
    }
    public void tru(int a,int b) {  
        System.out.printf("Ket qua: %d - %d = %d\n", a, b, a-b);
    }
    public void nhan(int a,int b) {
        System.out.printf("Ket qua: %d * %d = %d\n", a, b, a*b);
    }
    public void chia(int a,int b) {  
        System.out.printf("Ket qua: %d / %d = %f\n", a, b,(float)a/b);
    }
    
}
