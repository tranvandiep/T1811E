/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.QuanLySoThu;

import static aptech.QuanLySoThu.Main.input;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LQT
 */
public class Zoo {
    ArrayList<Room> listRoom = new ArrayList <Room>();
    
    public void addRoom(Room room){
        listRoom.add(room);
    }
    
    public Room getRoom(int roomNo){
        for(int i = 0; i < listRoom.size(); i++){
            if(listRoom.get(i).getRoomNo() == roomNo){
                return listRoom.get(i);
            }
        }
        return null;
    }
    
    public void deleteRoom(int roomNo){
        for(int i = 0; i < listRoom.size(); i++){
            if(listRoom.get(i).getRoomNo() == roomNo){
                listRoom.remove(i);
            }
        }
    }
    
    public void addAnimal(){
        Scanner input = new Scanner(System.in);
        System.out.println("Chon chuong can them dong vat");
        for (int i = 0; i < listRoom.size(); i++) {
            System.out.println(listRoom.get(i).getRoomNo());
        }
        
        int roomNo = Integer.parseInt(input.nextLine());
        
        System.out.println("Chon con vat can them");
        System.out.println("1. Tiger");
        System.out.println("2. Dog");
        System.out.println("3. Cat");
        System.out.println("Moi chon : ");
        
        int choose = Integer.parseInt(input.nextLine());
        
        Animal animal = null;
        
        switch(choose){
            case 1:
                animal = new Tiger();
                break;
                
            case 2:
                animal = new Dog();
                break;
            case 3:
                animal = new Cat();
                break;
            default:
                System.out.println("Khong co con vat nay, chon lai !!!");
                break;
        }
        
        animal.inputAnimal();
        
        Room room = getRoom(roomNo);
        if(room != null){
            room.addAnimal(animal);
        }
    }
    
    public void deteleAnimal(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten dong vat can xoa : ");
        String name = input.nextLine();
        for(Room room : listRoom){
            room.deleteAnimal(name);
        }
    }
    
    public void showAllInfo(){
        for(int i = 0 ; i < listRoom.size(); i++){
           listRoom.get(i).showInfo();
        }
    }
}
