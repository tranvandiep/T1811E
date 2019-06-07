/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt522;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author mac
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        People people = new People();
        Car car = new Car();
        People people1 = new People();
        Car car1 = new Car();
        List<IInfor> a = new ArrayList<>();
        
        people.input();
        a.add(people);
        people1.input();
        a.add(people1);
        car.carInput();
        a.add(car);
        car1.carInput();
        a.add(car1);
        
        showInfor(a);
    }
    
    public static void showInfor(List<IInfor> arrObject){
        for (int i = 0; i < arrObject.size(); i++) {
            arrObject.get(i).showInfor();
        }
    }
}
