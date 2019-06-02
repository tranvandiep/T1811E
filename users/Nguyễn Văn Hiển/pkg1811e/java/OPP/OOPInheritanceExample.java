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
import java.util.Scanner;

interface InheritanceEx {
void fill();
void print();
}

public class OOPInheritanceExample implements InheritanceEx {
    public void print() {
        System.out.println("Hello");
    }
    public void fill() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
    }
    public void sum() {
        System.out.printf("%d\n", +(1+2));
    }
    
    public static void main(String[] args) {
        OOPInheritanceExample a = new OOPInheritanceExample();
        a.print();
        a.fill();
        a.sum();
    }
}
