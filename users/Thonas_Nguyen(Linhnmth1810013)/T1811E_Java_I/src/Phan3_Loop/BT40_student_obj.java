/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan3_Loop;

/**
 *
 * @author linhn
 */
public class BT40_student_obj {
    String fullName;
    int age;
    String address;
    String email;
    int phone;

    public BT40_student_obj(String fullName, int age, String address, String email, int phone) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public BT40_student_obj() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
