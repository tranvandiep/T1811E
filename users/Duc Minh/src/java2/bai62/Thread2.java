/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.bai62;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh
 */
public class Thread2 extends Thread {

    SharedData sharedData;

    public Thread2(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {

        for (int i = 0; i < sharedData.que.length; i++) {
            synchronized (sharedData) {
                sharedData.notifyAll();
                try {
                    sharedData.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Que quan: " + sharedData.que[i]);
        }
        synchronized (sharedData) {
            sharedData.notifyAll();
        }
    }

}
