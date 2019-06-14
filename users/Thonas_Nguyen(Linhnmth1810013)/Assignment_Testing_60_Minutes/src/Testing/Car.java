/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author linhn
 */
public abstract class Car implements IInfor {
    String tenCar;
    String mauCar;

    public Car() {
    }

    public Car(String tenCar, String mauCar) {
        this.tenCar = tenCar;
        this.mauCar = mauCar;
    }
    public abstract void input();
    
}
