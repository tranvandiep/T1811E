/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai46;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minh
 */
public class Test {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("BW123", "BMW");

        car1.input();
        car1.display();
        car2.display();

        Computer computer1 = new Computer();
        Computer computer2 = new Computer("GS65", "MSI");

        computer1.input();
        computer1.display();
        computer2.display();

        Country country1 = new Country();
        Country country2 = new Country("Ha Noi", "Mien Bac - Viet Nam");

        country1.input();
        country1.display();
        country2.display();

        House[] house = new House[2];
        house[1].input();
        house[2].input();
        house[1].display();
        house[2].display();

        List<Mark> markList = new ArrayList<>();
        Mark mark = new Mark();
        markList.get(0).input();
        markList.get(1).input();
        markList.add(mark);
        markList.get(0).display();
        markList.get(1).display();
    }
}
