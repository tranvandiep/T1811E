/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai58;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class AnimalTest {

    public static void main(String[] args) {

        List<IAnimal> animalList = new ArrayList<>();

        animalList.add(new Animal());
        animalList.add(new Animal());
        animalList.add(new Animal());

        animalList.add(new Chicken());
        animalList.add(new Chicken());
        animalList.add(new Chicken());

        animalList.add(new Cat());
        animalList.add(new Cat());
        animalList.add(new Cat());

        inputDataForAnimal();
        displayDataForAnimal();

    }

    static void inputDataForAnimal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of animal: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            Animal animal = new Animal();
            animalList.get(i).input();

            animalList.add(animal);
        }
    }

    static void displayDataForAnimal() {
        for (IAnimal anmlList : animalList) {
            anmlList.dishplay();
        }
    }
}
