/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt522;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author anthony_jsc
 */
public class Test {
    static List<IInfor> list = new ArrayList<>();
    static People people = new People();
    static Car car = new Car();
    public static void main(String[] args) { 
        
//        people.input();
//        car.input();
//        
//        people.showInfor();
//        car.showInfor();

//        list.add(car);
//        list.add(car);
//        list.add(people);
//        list.add(people);
//        
//        people.input();
//        people.input();
//        car.input();
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong doi tuong: ");
        n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nguoi : " + (i+1));
            people.input();
            System.out.println("Nhap thong xe : " + (i+1));
            car.input();
            
            list.add(people);
            list.add(car);
        }
        
        for (int i = 0; i < list.size(); i++) {
            people.showInfor();
            car.showInfor();
        }
    }
   
}
