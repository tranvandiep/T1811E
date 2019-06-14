/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.DataStructure;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author PC
 */
public class EnumerationExample {
    public static void main(String[] args) {
        Vector vt = new Vector();
        Enumeration e;
        
        vt.add(1);
        vt.add(3);
        vt.add(5);
        vt.forEach((a) -> System.out.println(a));
        e = vt.elements();
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
                
    }
    
}
