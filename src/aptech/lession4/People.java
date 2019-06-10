/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession4;

/**
 *
 * @author Diep.Tran
 */
public class People {
    String fullname;
    String address;
    int age;
    String gender;

    public People() {
        System.out.println("People >> ko doi so");
    }

    public People(String fullname, String address, int age, String gender) {
        System.out.println("People >> ham tao day du doi so");
        this.fullname = fullname;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void running() {
        System.out.println("People is running");
    }
}
