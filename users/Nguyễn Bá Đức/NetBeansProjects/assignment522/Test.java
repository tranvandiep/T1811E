/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment522;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP ENVY
 */
public class Test {
    public static void main(String[] args) {
        People people = new People();
        Car car = new Car();
        List<Infor> a = new ArrayList<>();
        
        people.input();
        a.add(people);
        
        car.input();
        a.add(car);
        
        showInfor(a);
    }
    
    public static void showInfor(List<Infor> arrObject){
        for (int i = 0; i < arrObject.size(); i++) {
            arrObject.get(i).showInfor();
        }
    }
}
