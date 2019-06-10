/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vuqua
 */
public class Author { 
    private String name;
    private int old;
    private String nickname;
    private String birthday;
    private String address;

    public Author() {
    }

    public Author(String nickname) {
        this.nickname = nickname;
    }
    
    
    
    public Author(String name, int old, String nickname, String birthday, String address) {
        this.name = name;
        this.old = old;
        this.nickname = nickname;
        this.birthday = birthday;
        this.address = address;
    }
    
    public void input(ArrayList<Author> authorList) {
        System.out.println("-----------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten tac gia: ");
        name=input.nextLine();
        
        System.out.println("Nhap tuoi: ");
        old= Integer.parseInt(input.nextLine());
        
        System.out.println("Nhap but danh: ");
        while (true){
            nickname= input.nextLine();
            boolean isFind=false;
            for (int i=0;i<authorList.size();i++){
                if(authorList.get(i).getNickname().equalsIgnoreCase(nickname)){
                    isFind =true;
                    break;
                }
            }
            if (!isFind) {
                break;
            } else {
                System.err.println("Nhap but danh khac: ");
            }
            
            
        }
        
        
        System.out.println("Nhap ngay sinh: ");
        birthday= input.nextLine();
        
        System.out.println("Nhap dia chi: ");
        address= input.nextLine();
        
    }
    
    public void input() {
        System.out.println("-----------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten tac gia: ");
        name=input.nextLine();
        
        System.out.println("Nhap tuoi: ");
        old= Integer.parseInt(input.nextLine());
        
        System.out.println("Nhap ngay sinh: ");
        birthday= input.nextLine();
        
        System.out.println("Nhap dia chi: ");
        address= input.nextLine();
        
    }
     
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", old=" + old + ", nickname=" + nickname + ", birthday=" + birthday + ", address=" + address + '}';
    }
    
    
    
    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }
    
    
    
    
    
    
}
