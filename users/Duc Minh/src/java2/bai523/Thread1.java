/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.bai523;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh
 */
public class Thread1 extends Thread {

    ArrayList<Integer> list1 = new ArrayList<>();

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int rad = random.nextInt(100);
            list1.add(rad);

            System.out.println("T1:" + rad);
        }
    }
}
