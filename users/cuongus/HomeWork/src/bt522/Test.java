/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt522;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author anthony_jsc
 */
public class Test {
    public static void main(String[] args) {
        List<IInfor> list = new ArrayList<>();
        People people = new People();
        Car car = new Car();
        
        people.input();
        car.input();
        
        people.showInfor();
        car.showInfor();
    }
   
}
