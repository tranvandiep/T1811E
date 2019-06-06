/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai81;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DuongQuangHuy
 */
public class Author {
    String name;
    int age;
    String pseudonym;
    String birthday;
    String homeTown;
    
    
    public void inputAuthor(List<Author> authorList){
        Scanner input = new Scanner(System.in);
        inputAuthor();
        System.out.println("nhap but danh : ");
        while(true){
            pseudonym = input.nextLine();
            boolean timKiem = false;
            for (int i = 0; i < authorList.size(); i++) {
                if(authorList.get(i).getPseudonym().equalsIgnoreCase(pseudonym)){
                    System.out.println("da trung ten nhap lai");
                    timKiem = true;
                    break;
                }
            }
            if(!timKiem){
                break;
            }
            else{
                System.err.println("but danh da ton tai moi nhap but danh khac :");
            }
        }
        
       
       
        
    }
       public void inputAuthor(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ten tac gia");
        name = input.nextLine();
        System.out.println("nhap tuoi");
        age = Integer.parseInt(input.nextLine());
        System.out.println("nhap ngay sinh");
        birthday = input.nextLine();
        System.out.println("nhap que quan");
        homeTown = input.nextLine();
        
    }
    public void displayAuthor(){
        System.out.printf(
                  " ten : %s "
                + " tuoi : %d "
                + " but danh : %s "
                + " ngay sinh : %s "
                + " que quan : %s  "
                , name , age ,pseudonym , birthday , homeTown
        );
    }
    
    public Author() {
    }

    public Author(String pseudonym) {
        this.pseudonym = pseudonym;
    }
    
    public Author(String name, int age, String pseudonym, String birthday, String homeTown) {
        this.name = name;
        this.age = age;
        this.pseudonym = pseudonym;
        this.birthday = birthday;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
    
    
}
