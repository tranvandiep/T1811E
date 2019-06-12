/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.adf1javabasicexamination.exercise1;

/**
 *
 * @author Duy Lumiere
 */
public class Bank {
    private double balance;
    private double rate;
    
    public Bank(){
        
    }

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public double calculateInterest(double balance, double rate){
        return balance*(rate/1200);
    }
}
