/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

/**
 *
 * @author Minh
 */
public abstract class Cat extends Animal {

    @Override
    abstract void tiengKeu();

    public Cat() {
    }

    public Cat(String ten, int tuoi, String mota) {
        super(ten, tuoi, mota);
    }

}
