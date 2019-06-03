/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diep.Tran
 */
public class Main {
    public static void main(String[] args) {
        List<Action> actionList = new ArrayList<>();
        
        actionList.add(new People());
        actionList.add(new People());
        actionList.add(new People());
        
        actionList.add(new Car());
        actionList.add(new Car());
        actionList.add(new Car());
        
        actionList.add(new Animal());
        actionList.add(new Animal());
        
        for (Action action : actionList) {
            action.running();
        }
//        List<People> peoples = new ArrayList<>();
//        List<Animal> animals = new ArrayList<>();
//        List<Car> cars = new ArrayList<>();
//        
//        peoples.add(new People());
//        peoples.add(new People());
//        peoples.add(new People());
//        
//        animals.add(new Animal());
//        animals.add(new Animal());
//        
//        cars.add(new Car());
//        cars.add(new Car());
//        
//        for (Car car : cars) {
//            car.running();
//        }
//        
//        for (People people : peoples) {
//            people.running();
//        }
//        
//        for (Animal animal : animals) {
//            animal.running();
//        }
    }
}
