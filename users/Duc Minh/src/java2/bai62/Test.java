/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.bai62;

/**
 *
 * @author Minh
 */
public class Test {

    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        Thread1 t1 = new Thread1(sharedData);
        Thread2 t2 = new Thread2(sharedData);

        t1.start();
        t2.start();
    }
}
