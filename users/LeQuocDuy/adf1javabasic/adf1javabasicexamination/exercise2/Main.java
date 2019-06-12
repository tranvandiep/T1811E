/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.adf1javabasicexamination.exercise2;
import java.util.Scanner;
/**
 *
 * @author Duy Lumiere
 */
public class Main {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        
        System.out.println("g1: ");
        Flight g1 = new Flight(857, "Toronto");
        System.out.println("g1 number is: " + g1.getNumber());
        System.out.println("g1 destination is: " + g1.getDestination());
        g1.display();
        
        System.out.println("g2: ");
        Flight g2 = new Flight(-1, "Toronto");
        System.out.println("SAFE EMPTY STATE: ");
        System.out.println("g2 number is: " + g2.getNumber());
        System.out.println("g2 destination is: " + g2.getDestination());
        g2.display();
        
        System.out.println("g3: ");
        Flight g3 = new Flight(964, "");
        System.out.println("SAFE EMPTY STATE: ");
        System.out.println("g3 number is: " + g3.getNumber());
        System.out.println("g3 destination is: " + g3.getDestination());
        g3.display();
        
        System.out.println("g4: ");
        Flight g4 = new Flight();
        System.out.println("SAFE EMPTY STATE: ");
        System.out.println("g4 number is: " + g4.getNumber());
        System.out.println("g4 destination is: " + g4.getDestination());
        g4.display();
        
        System.out.println("g5: ");
        Flight g5 = new Flight(-1,"");
        System.out.println("SAFE EMPTY STATE: ");
        System.out.println("g5 number is: " + g5.getNumber());
        System.out.println("g5 destination is: " + g5.getDestination());
        g5.display();
    }
}
