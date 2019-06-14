/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.println("Input your balance: ");
        bank.balance = Double.parseDouble(input.nextLine());
        System.out.println("Input annual interes rate of Bank: ");
        bank.rate = Double.parseDouble(input.nextLine());
        System.out.println("The interest is: " + bank.calculateInterest());

    }
}
