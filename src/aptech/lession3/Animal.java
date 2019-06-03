/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession3;

/**
 *
 * @author Diep.Tran
 */
public class Animal {
    String name;
    String foodType;
    int age;

    public Animal() {
    }

    public Animal(String name, String foodType, int age) {
        this.name = name;
        this.foodType = foodType;
        this.age = age;
    }

    public void input() {
        
    }
    
    public void display() {
        
    }
    
    //-----------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}
