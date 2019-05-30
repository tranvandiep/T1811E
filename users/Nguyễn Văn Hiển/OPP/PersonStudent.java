/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

import java.util.Scanner;
import java.util.regex.Matcher;
/**
 *
 * @author PC
 */
public class PersonStudent extends Person {
    private String id;
    private double everage;
    private String email;
    
    Scanner input = new Scanner(System.in);

    public PersonStudent() {
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        if(id.length() == 8) {
            this.id = id;
        }
    }

    public double getEverage() {
        return everage;
    }
    public void setEverage(double everage) {
        this.everage = everage;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo() {
        String id;
        double everage;
        String email;
        String emailRegex = "^[a-z0-9A-Z]+@([a-z0-9A-Z]+\\.)com";
        
            super.inputInfo();
            do {
                System.out.print("Ma sinh vien: ");
                this.id = input.nextLine();
                if(this.id == null || "".equals(this.id.trim())) {
                    System.out.println("Khong duoc de trong ma sinh vien");
                }
                if(this.id.length() != 8) {
                    System.out.println("Ma sinh vien phai co 8 ky tu");
                }
            } while(this.id == null || "".equals(this.id.trim()) || this.id.length() != 8);
            do {
                System.out.print("Diem trung binh: ");
                this.everage = Double.parseDouble(input.nextLine());
                if(this.everage < 0) {
                    System.out.println("Diem trung binh khong duoc nho hon 0.0");
                }
                if(this.everage > 10) {
                    System.out.println("Diem trung binh khong duoc vuot qua 10.0");
                }
            } while(this.everage < 0 || this.everage > 10);
            do {
                System.out.print("Email: ");
                this.email = input.nextLine();
                if(this.email.matches(emailRegex) == false) {
                    System.out.println("Email khong hop le");
                }
            } while(this.email.matches(emailRegex) == false);
             
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void showInfo() {
        System.out.println(toString() +" - " +this.id +" - " +this.everage +" - " +this.email);
    }
    
    public void checkScholarship(double average) {
        if(everage > 8.0) {
            System.out.println("Du dieu kien nhan hoc bong");
        }
    }
    
    
    public PersonStudent(String id, double everage, String email, String name, String gender, String birth, String address) {
        super(name, gender, birth, address);
        this.id = id;
        this.everage = everage;
        this.email = email;
    }
    
}
