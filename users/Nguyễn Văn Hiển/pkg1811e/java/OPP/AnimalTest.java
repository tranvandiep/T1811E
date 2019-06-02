/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class AnimalTest{
        List<Animal> animalList = new ArrayList<>();
        Animal animal = new Animal();
        Animal cat = new AnimalCat();
        Animal chicken = new AnimalChicken();

    public AnimalTest() {
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Animal getCat() {
        return cat;
    }

    public Animal getChicken() {
        return chicken;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setCat(Animal cat) {
        this.cat = cat;
    }

    public void setChicken(Animal chicken) {
        this.chicken = chicken;
    }
        
    
    public void inputDataForAnimal() {
        cat.input();
        chicken.input();
        animal.input();
        animalList.add(cat);
        animalList.add(chicken);
        animalList.add(animal);
    }

    
    public void displayDataOfAnimal() {
        for(Animal animal : animalList) {
            animal.display();
        }
    }
}