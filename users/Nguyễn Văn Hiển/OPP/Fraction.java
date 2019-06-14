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
public class Fraction {
    int denominator;
    int numberator;
    
    public Fraction() {
        
    }
    
    public void setNumber(int num) {
        this.numberator = num;
    }
    public void setDeno(int deno) {
        this.denominator = deno;
    }
        
    public int getDeno() {
        return denominator;
    }
    public int getNumber() {
        return numberator;
    }
    
    public void simplify(int numberator, int denominator) {
        int a = numberator;
        int b = denominator;
        while(a != b) {
            if(a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        if(numberator%denominator == 0) {
            this.numberator = numberator/denominator;
            this.denominator = 1;
        } else {
            this.numberator = numberator/a;
            this.denominator = denominator/a;
        }
    }
    public Fraction(int denominator, int numberator) {
        this.denominator = denominator;
        this.numberator = numberator;
    }
}
