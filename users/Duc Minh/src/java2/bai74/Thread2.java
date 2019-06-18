/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.bai74;

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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (true) {
            synchronized (sharedData) {
                sharedData.notifyAll();

                try {
                    sharedData.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }

                int r = sharedData.getRad() * sharedData.getRad();
                System.out.println("t2: " + r);

            }
        }
    }

}
