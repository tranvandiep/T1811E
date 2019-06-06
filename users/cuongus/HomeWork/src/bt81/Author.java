/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt81;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class Author {
    private String name;
    private int old;
    private String nickname;
    private String address;
    private String birthday;

    public Author() {
    }

    public Author(String nickname) {
        this.nickname = nickname;
    }

    public Author(String name, int old, String nickname, String address, String birthday) {
        this.name = name;
        this.old = old;
        this.nickname = nickname;
        this.birthday = birthday;
        this.address = address;
    }
public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten tac gia: ");
        name = input.nextLine();
        
        System.out.println("Nhap tuoi: ");
        old = Integer.parseInt(input.nextLine());
        
        System.out.println("Nhap ngay sinh: ");
        birthday = input.nextLine();
        
        System.out.println("Nhap dia chi: ");
        address = input.nextLine();
        
    }
    public void input(ArrayList<Author> authorList){
        input();
        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap ten tac gia: ");
//        name = input.nextLine();
//        
//        System.out.println("Nhap tuoi: ");
//        old = Integer.parseInt(input.nextLine());
        
        System.out.println("Nhap but danh: ");
            while(true){
                nickname = input.nextLine();
                boolean isFind = false; 
                for (int i = 0; i < authorList.size(); i++) {
                    if (authorList.get(i).getNickname().equalsIgnoreCase(nickname)){
                    isFind = true;
                    break;
                    }
                }
                if (!isFind){
                    break;
                }else{
                    System.err.println("Hay nha but danh khac.");
                }
            }
        
//        System.out.println("Nhap ngay sinh: ");
//        birthday = input.nextLine();
//        
//        System.out.println("Nhap dia chi: ");
//        address = input.nextLine();
        System.out.println("*--------------------------*");
    }
    
    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", old=" + old + ", nickname=" + nickname + ", address=" + address + ", birthday=" + birthday + '}';
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
