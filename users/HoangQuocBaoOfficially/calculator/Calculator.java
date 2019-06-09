
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;
import java.util.Scanner;

/**
 *
 * @author BAOHOANG
 */
public class Calculator {
    void cong(int a, int b) {
        System.out.printf("Tong cua so %d va %d la %d\n", a, b, a +b);
    }
    
    void tru(int a, int b) {
        System.out.printf("Hieu cua so %d va %d la %d\n", a, b, a -b);
    }
    
    void nhan(int a, int b) {
        System.out.printf("Tich cua so %d va %d la %d\n", a, b, a *b);
    }
    
    void chia(int a, int b) {
        System.out.printf("Thuong cua so %d va %d la %d du %d\n", a, b, a /b, a %b);
    }
}
