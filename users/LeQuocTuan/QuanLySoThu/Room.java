/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.QuanLySoThu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LQT
 */
public class Room {
    private int roomNo;
    ArrayList<Animal> listAnimal = new ArrayList<Animal>();
    
    public void addAnimal (Animal animal){
        listAnimal.add(animal);
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
    
    public void deleteAnimal(String name){
        for(int i = 1; i <= listAnimal.size(); i++ ){
            if(listAnimal.get(i).getName().equalsIgnoreCase(name)){
                listAnimal.remove(i);
            }
        }
    }
    
    public void inputRoom(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao ma chuong : ");
        roomNo = Integer.parseInt(input.nextLine());
    }
    
    public void showInfo(){
        for(Animal animal : listAnimal){
            animal.showInfo();
            animal.showSound();
        }
    }
}
