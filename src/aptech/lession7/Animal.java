/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession7;

/**
 *
 * @author Diep.Tran
 */
public abstract class Animal {
    String name;
    
    public Animal() {
    }
    
    public abstract void showSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
