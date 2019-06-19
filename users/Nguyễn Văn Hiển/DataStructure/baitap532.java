/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */

class Thread1 extends Thread {
    List<Integer> intList = new ArrayList<>();
    Random rd = new Random();
    int a;

    public Thread1() {
    }

    public List<Integer> getIntList() {
        return intList;
    }

    public void setIntList(List<Integer> intList) {
        for(int i = 0; i < 10; i++) {
            
        }
        this.intList = intList;
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            this.a = rd.nextInt(100);
            intList.add(a);
            try {
                Thread1.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 

    public void display() {
        for(int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) +"  ");
        }
    }
    
    public Thread1(int a) {
        this.a = a;
    }
}

class Thread2 extends Thread {
    List<Character> charList = new ArrayList<>();
    double a;
    char b;

    public Thread2() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public char getB() {
        return b;
    }

    public void setB(char b) {
        this.b = b;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            a = 65+Math.random()*26;
            b = (char)a;
            charList.add(b);
            try {
                Thread2.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void display() {
        for(int i = 0; i < charList.size(); i++) {
            System.out.print(charList.get(i) +"  ");
        }
    }
    
    public Thread2(double a, char b) {
        this.a = a;
        this.b = b;
    }
    
}

public class baitap532 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(baitap532.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(baitap532.class.getName()).log(Level.SEVERE, null, ex);
        }
        t1.display();
        System.out.println();
        t2.display();
        
    }
}
