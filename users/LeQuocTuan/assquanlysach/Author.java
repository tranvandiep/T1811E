/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assquanlysach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LQT
 */
public class Author {

    private String name;
    private int age;
    private String pseudonym;
    private String birthDay;
    private String nativeCountry;

    public static ArrayList<Author> listAuthor = new ArrayList<>();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getNativeCountry() {
        return nativeCountry;
    }

    public Author() {
        listAuthor.add(this);
    }

    public Author(String name, int age, String pseudonym, String birthDay, String nativeCountry) {
        this.name = name;
        this.age = age;
        this.pseudonym = pseudonym;
        this.birthDay = birthDay;
        this.nativeCountry = nativeCountry;
        listAuthor.add(this);
    }

    public void inputAuthor() {
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao ten tac gia : ");
        name = input.nextLine();
        
        System.out.println("Nhap vao tuoi tac gia : ");
        age = Integer.parseInt(input.nextLine());
        
        do {
            System.out.println("Nhap vao but danh tac gia : ");
            pseudonym = input.nextLine();
            for (int i = 0; i < listAuthor.size(); i++) {
                if (this == listAuthor.get(i))
                    continue;
                if (listAuthor.get(i).getPseudonym().equalsIgnoreCase(pseudonym)) {
                    flag = true;
                    System.out.println("But danh tac gia da ton tai. Kiem tra lai !!!");
                } else {
                    flag = false;
                }
            }
        } while (flag == true);
        
        System.out.println("Nhap vao ngay sinh tac gia : ");
        birthDay = input.nextLine();
        
        System.out.println("Nhap vao que quan tac gia : ");
        nativeCountry = input.nextLine();
        
    }
    
    public void showAuthor(){
        System.out.println("Ten : " + name);
        System.out.println("Tuoi : " + age);
        System.out.println("But danh : " + pseudonym);
        System.out.println("Ngay sinh : " + birthDay);
        System.out.println("Que quan : " + nativeCountry);
    }

    public static boolean contains(String pseudonym) {
        if (get(pseudonym) == null)
            return false;
        return true;
    }
    
    public static Author get(String pseudonym) {
       for (Author e :  listAuthor) {
           if (e.pseudonym.equalsIgnoreCase(pseudonym))
               return e;
       }
       return null; //else       
    }
}
