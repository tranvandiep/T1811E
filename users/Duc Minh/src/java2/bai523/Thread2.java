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
public class Thread2 extends Thread {

    ArrayList<Character> list2 = new ArrayList<>();
    int min = (int) 'a';
    int max = (int) 'z';
    int limit = max - min;

    @Override
    public void run() {
        try {
            Thread1.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
        }

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int rad = random.nextInt(limit) + min;
            char c = (char) rad;
            list2.add(c);

            System.out.println("T2:" + c);
        }
    }
}
