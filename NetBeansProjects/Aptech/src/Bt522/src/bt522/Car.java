/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt522;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Car implements IInfor{
    String carName;
    String color;

    public Car() {
    }

    public Car(String carName, String color) {
        this.carName = carName;
        this.color = color;
    }

    public String getCarName() {
        return carName;
    }

    public String getColor() {
        return color;
    }

    public Scanner getInput() {
        return input;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
    
    
    
    @Override
    public void showInfor() {
        System.out.printf("Ten xe: %s\n",carName);
        System.out.printf("Mau xe: %s\n",color);
    }
    
    Scanner input = new Scanner(System.in);
    public void carInput(){
        System.out.printf("Nhap ten xe: ");
        carName = input.nextLine();
        System.out.printf("Nhap mau xe: ");
        color = input.nextLine();
    }
}
