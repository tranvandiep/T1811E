/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

import java.util.Scanner;

/**
 *
 * @author linhn
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Flight flight = new Flight();
        System.out.println("Input flight number: ");
        flight.number = Integer.parseInt(input.nextLine());
        System.out.println("Input flight destination: ");
        flight.destination = input.nextLine();
        flight.display();
    }
}
