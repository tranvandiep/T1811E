/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.DataStructure;



/**
 *
 * @author PC
 */

public class GenericsExample {
    public static <Gen> void displayQueue(Gen[] inputArr) {
        for(Gen element : inputArr) {
            System.out.print(element);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        Character[] charArr = {'a', 'b', 'c', 'd'};
        
        displayQueue(intArr);
        displayQueue(charArr);
    }
}
