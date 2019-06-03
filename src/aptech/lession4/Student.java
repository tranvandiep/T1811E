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
public class Student extends People {
    String rollNo;
    String email;

    public Student() {
//        super("A", "Nam Dinh", 12, "Nam");
        System.out.println("Student >> ko doi so");
    }

    public Student(String rollNo, String email, String fullname, String address, int age, String gender) {
        super(fullname, address, age, gender);
        this.rollNo = rollNo;
        this.email = email;
    }
    
    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void running() {
        super.running();
        System.out.println("Student is running");
    }
    
    public void running(String message) {
        System.out.println("OKOK >> " + message);
    }
}
