/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.DataStructure;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
class ConnectInfo {
    int key;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
class ThreadStd extends Thread {
    ConnectInfo key = new ConnectInfo();

    public ThreadStd(ConnectInfo ci) {
        this.key = ci;
    }

    @Override
    public void run() {
        String[] stdList = {"Nguyen Ngoc Lan","Duong Tien Nam","Ngo Anh Quan","Pham Van Duc","Tran Thi Ha"};
        
        synchronized(key) {
            for(int i = 0; i < stdList.length; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadStd.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(stdList[i]);
                key.setKey(i);
                key.notify();
                try {
                    key.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadStd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        synchronized(key) {
            key.notifyAll();
        }
    }  
}

class ThreadHome extends Thread {
    ConnectInfo key = new ConnectInfo();

    public ThreadHome(ConnectInfo ci) {
        this.key = ci;
    }

    @Override
    public void run() {
        String[] homeList = {"Hải Phòng","Hà Nội","Thái Nguyên","Hà Tĩnh","Quảng Ninh"};
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized(key) {
            for(int i = 0; i < homeList.length; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadHome.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Quê quán: " +homeList[key.getKey()] +"\n");
                key.notify();
                try {
                    key.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadHome.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        synchronized(key) {
            key.notifyAll();
        }
    }
    
    
}

public class baitap62I {
    public static void main(String[] args) {
        ConnectInfo key = new ConnectInfo();
        
        ThreadStd std = new ThreadStd(key);
        ThreadHome home = new ThreadHome(key);
        
        std.start();
        home.start();
    }
}
