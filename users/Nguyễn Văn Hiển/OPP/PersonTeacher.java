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
import java.util.Scanner;

public class PersonTeacher extends Person {
    String classId;
    double feePerHour;
    double hourPerMonth;
    double fee = 0;

    public PersonTeacher() {
       
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public double getFeePerHour() {
        return feePerHour;
    }

    public void setFeePerHour(double feePerHour) {
        this.feePerHour = feePerHour;
    }

    public double getHourPerMonth() {
        return hourPerMonth;
    }

    public void setHourPerMonth(double hourPerMonth) {
        this.hourPerMonth = hourPerMonth;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    public void showInfo() {
        System.out.println(toString() + " - "+ this.classId +" - " +this.feePerHour +" - " +this.hourPerMonth);
    }

    @Override
    public void inputInfo() {
        String classIdRegex = "^C[0-9A-Z]+[GHIKLM]$";
        
        super.inputInfo(); 
        do {
            System.out.print("Nhap ten lop: ");
            this.classId = input.nextLine();
            if(this.classId.matches(classIdRegex) == false || this.classId.length() != 6) {
                System.out.println("Ma lop khong phu hop. Ma lop phai co 6 ki tu bao gom so va chu in hoa, bat dau bang C va ket thuc boi G hoac H hoac I hoac K hoac L hoac M");
            }
        } while(this.classId.matches(classIdRegex) == false || this.classId.length() != 6);
        do {
            System.out.print("Tien luong/gio: ");
            this.feePerHour = Double.parseDouble(input.nextLine());
            if(this.feePerHour < 0) {
                System.out.println("Tien luong khong duoc la so am");
            }
        } while(this.feePerHour < 0);
        do {
            System.out.print("So gio day/thang: ");
            this.hourPerMonth = Double.parseDouble(input.nextLine());
            if(this.hourPerMonth < 0) {
                System.out.println("So gio day khong duoc la so am");
            }
        } while(this.hourPerMonth < 0);
        
    }   
    
    public void calculateFee() {
        switch(this.classId.charAt(5)) {
            case 'G':
            case 'H':
            case 'I':
            case 'K':
                this.fee = this.feePerHour*this.hourPerMonth;
                System.out.println("Tien luong thang la: " +fee);
                break;
            case 'L':
            case 'M':
                this.fee = this.feePerHour*this.hourPerMonth+200;
                System.out.println("Tien luong thang la: " +fee);
                break;
        }
        
    }
    
    
    public PersonTeacher(String classId, double feePerHour, double hourPerMonth, String name, String gender, String birth, String address) {
        super(name, gender, birth, address);
        this.classId = classId;
        this.feePerHour = feePerHour;
        this.hourPerMonth = hourPerMonth;
    }
    
    
}
