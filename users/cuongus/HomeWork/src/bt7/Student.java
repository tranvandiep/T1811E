/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt7;

import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class Student extends Person {
    String maSV;
    float diem;
    String email;

    public Student() {
    }

    public Student(String maSV, float diem, String email) {
        this.maSV = maSV;
        this.diem = diem;
        this.email = email;
    }

    public Student(String maSV, float diem, String email, String fullName, String gender, String bdate, String address) {
        super(fullName, gender, bdate, address);
        this.maSV = maSV;
        this.diem = diem;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public float getDiem() {
        return diem;
    }

    public String getEmail() {
        return email;
    }

    public boolean setMaSV(String maSV) {
        if(maSV != null && maSV.length() == 8){
            this.maSV = maSV;
            return true;
        }else{
            System.err.println("Nhap lai ma sinh vien: ");
            return false;
        }
    }

    public boolean setDiem(float diem) {
        if (diem >=0 && diem <= 10){
            this.diem = diem;
            return true;
        }else {
            System.err.println("Nhap lai diem: ");
            return false;
        }
        
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@") && !email.contains(" ")){   
            this.email = email;
            return true;
        }else {
            System.err.println("Nhap lai dia chi email: ");
            return false;
        }
    }
    
    @Override
    public void inputInfo() {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma so sinh vien: ");
        while(true){
            String maSVinput = input.nextLine();
            boolean check = setMaSV(maSVinput);
            if (check){
                break;
            }
        }     
//        while (!setmaSV(input.nextLine()));
        System.out.println("Nhap diem so sinh vien: ");
        while (true){
            float diemInput = Float.parseFloat(input.nextLine());
            boolean check = setDiem(diemInput);
            if (check){
            break;
            }
        }
        System.out.println("Nhap email sinh vien: ");
         while(true){
            String emailInput = input.nextLine();
            boolean check = setMaSV(emailInput);
            if (check){
                break;
            }
        }
    }

    @Override
    public void showInfo() {
        super.showInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap ma so sinh vien: " + maSV);
        
        System.out.println("Nhap diem so sinh vien: " + diem);
   
        System.out.println("Nhap email sinh vien: " + email);
       
    }
   
    public void hocBong(){
        if (diem > 8.0){
            System.out.println("Sinh Vien dat hoc bong");
        }
    }
}


