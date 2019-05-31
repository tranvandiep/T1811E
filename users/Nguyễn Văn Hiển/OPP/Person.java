/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

/**
 *
 * @author PC
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Person {
    private String name;
    private String gender;
    private String birth;
    private String address;
    
    Scanner input = new Scanner(System.in);
    
    public Person() {
        
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        if(gender.equalsIgnoreCase("nam")) {
            this.gender = gender;
        }
        if(gender.equalsIgnoreCase("nu")) {
            this.gender = gender;
        }  
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getBirth() {
        return birth;
    }
    public String getAddress() {
        return address;
    }
    
    public void inputInfo() {
        String birthRegex = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
        do {
            System.out.print("Ho va ten: ");
            this.name = input.nextLine();
            if(this.name ==  null || "".equals(this.name.trim())) {
                System.out.println("Khong duoc de trong ho va ten");
            }
        } while(this.name ==  null || "".equals(this.name.trim()));
        do {
            System.out.print("Gioi tinh: ");
            this.gender = input.nextLine();
            if(this.gender.equalsIgnoreCase("nam") == false && this.gender.equalsIgnoreCase("nu") == false) {
                System.out.println("Gioi tinh chi duoc nhap la NAM hoac NU");
            }
        } while(this.gender.equalsIgnoreCase("nam") == false && this.gender.equalsIgnoreCase("nu") == false);
        do {
            System.out.print("Ngay sinh: ");
            this.birth = input.nextLine();
            if(this.birth.matches(birthRegex) == false) {
                System.out.println("Ngay sinh phai co dang dd/mm/yyyy hoac dd-mm-yyyy");
            }
        } while(this.birth.matches(birthRegex) == false);
        System.out.print("Dia chi: ");
        this.address = input.nextLine();
    }
    
    public void showInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return  (name + " - "
                 + gender + " - " 
                  + birth + " - "
                  + address
                );
    }


    public Person(String name, String gender, String birth, String address) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
    }
    
    
}
