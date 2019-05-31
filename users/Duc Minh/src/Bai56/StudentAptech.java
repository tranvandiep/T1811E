/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai56;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class StudentAptech implements IMark {

    private String StuId;

    private String StuName;

    private String gender;

    private String birthday;

    private String nativePlace;

    public StudentAptech() {
    }

    public StudentAptech(String StuId, String StuName, String gender, String birthday, String nativePlace) {
        this.StuId = StuId;
        this.StuName = StuName;
        this.gender = gender;
        this.birthday = birthday;
        this.nativePlace = nativePlace;
    }

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Student ID: ");
        StuId = input.nextLine();
        System.out.print("Input Student Name: ");
        StuName = input.nextLine();
        System.out.print("Input Student Gender: ");
        gender = input.nextLine();
        System.out.print("Input Student Birthday: ");
        birthday = input.nextLine();
        System.out.print("Input Student Address: ");
        nativePlace = input.nextLine();
    }

    @Override
    public void dishplay() {
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "StudentAptech{" + "StuId=" + StuId + ", StuName=" + StuName + ", gender=" + gender + ", birthday=" + birthday + ", nativePlace=" + nativePlace + '}';
    }

    
    
}
