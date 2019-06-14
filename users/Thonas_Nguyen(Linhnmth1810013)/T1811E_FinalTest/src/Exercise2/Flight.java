/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

/**
 *
 * @author linhn
 */
public class Flight {
    int number;
    String destination;

    public Flight() {
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public void display(){
        System.out.println("The number of Flight is: " + number);
        System.out.println("The destination of Flight is: " + destination);
    }
    
}
