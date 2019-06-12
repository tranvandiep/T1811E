/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.adf1javabasicexamination.exercise1;
import java.util.Scanner;
/**
 *
 * @author Duy Lumiere
 */
public class Main {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        double balance, rate;
        Bank bank = new Bank();
        
        System.out.println("=== CALCULATE INTEREST PROGRAM ===\n\n\n");
        System.out.print("Insert balance: ");
        balance = z.nextDouble();
        System.out.print("Insert Annual Interest Rate: ");
        rate = z.nextDouble();
        System.out.println("Interest Calculated is: " + bank.calculateInterest(balance, rate));
    }
}
