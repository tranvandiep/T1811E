/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.adf1javabasicexamination.exercise2;

/**
 *
 * @author Duy Lumiere
 */
public class Flight {

    private int number;
    private String destination;

    public Flight() {
        this.number = 0;
        this.destination = "";
    }

    public Flight(int number, String destination) {
        if (number < 0) {
            System.out.println("Flight number must be a positive value!");
            this.number = 0;
        } else {
            this.number = number;
        }
        if (destination.equalsIgnoreCase("")) {
            System.out.println("Flight destination shouldnt be NULL");
            this.destination = "";
        } else {
            this.destination = destination;
        }
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

    public void display() {
        System.out.println("Flight information is: " + this.getNumber() + ", " + this.getDestination() + "\n");
    }
}
