/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.DataStructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author PC
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<Integer>();
        
        qu.offer(9);
        qu.offer(6);
        
        qu.add(8);
        qu.add(10);
        
        qu.forEach((el) -> System.out.println(el));
        
        System.out.println(qu.poll());
    }
}
