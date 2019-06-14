/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.DataStructure;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author PC
 */
public class StackExample {
    public static void main(String[] args) {
        Stack st = new Stack();
//        st.add("abc");    
        for(int i = 0; i <= 12; i++) {
            st.push(i);
        }
        
        System.out.println(st);
//        System.out.println(st.empty());
//        System.out.println(st.elementAt(2));
//        st.forEach((a) -> System.out.println(a));
//        st.forEach((a) -> System.out.println(!st.empty()));
//        st.stream().forEach((a) -> System.out.println(a));
        while(!st.isEmpty()) {
            System.out.println(st.pop());
        }
    
    }
}
