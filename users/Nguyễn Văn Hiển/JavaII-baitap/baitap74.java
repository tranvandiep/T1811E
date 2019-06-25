/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.DataStructure;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
class ShareMemory {
    int sm;

    public int getSm() {
        return sm;
    }

    public void setSm(int sm) {
        this.sm = sm;
    }
}
class ThreadA extends Thread {
    ShareMemory share = new ShareMemory();

    public ThreadA(ShareMemory sm) {
        this.share = sm;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadA.class.getName()).log(Level.SEVERE, null, ex);
        }
        Random rd = new Random();
        synchronized(share) {
            for(int i = 0; i >= 0; i++) {
                int a = rd.nextInt(20)+1;
                share.setSm(a);
                System.out.println("a = "+a);
                share.notify();
                try {
                    share.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadA.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        synchronized(share) {
            share.notifyAll();
        }
    }
}

class ThreadB extends Thread {
    ShareMemory share = new ShareMemory();

    public ThreadB(ShareMemory sm) {
        this.share = sm;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            synchronized(share) {
                for(int i = 0; i >= 0; i++) {
                    int b = (int)(Math.pow(share.getSm(), 2));
                    System.out.println("a2 = "+b);
                    share.notify();
                    try {
                        share.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ThreadB.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadB.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized(share) {
            share.notifyAll();
        }
    }
}

public class baitap74 {
    public static void main(String[] args) {
        ShareMemory sm = new ShareMemory();
        
        ThreadA a = new ThreadA(sm);
        ThreadB b = new ThreadB(sm);
        
        a.start();
        b.start();

    }
}
