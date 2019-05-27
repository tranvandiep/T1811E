/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diep.Tran
 */
public class Main {
    public static void main(String[] args) {
//        Student std = new Student();
//        People people = new People();
//        std.running("Kid");
//        people.running();
        
//        std.fullname = "A";
//        people.fullname = "B";
//        
//        System.out.println(std.fullname);
//        System.out.println(people.fullname);
//        
//        System.out.println(std.getFullname());
        Student std = new Student();
        People people = new People();
        
        People p = new Student();
        if(p instanceof Student) {
            //ep kieu.
            ((Student) p).setEmail("a@gmail.com");
            System.out.println(((Student) p).getEmail());
        }
        //10 people + 10 student
        List<Student> studentList = new ArrayList<>();
        studentList.add(std);
        for (Student student : studentList) {
            student.running();
        }
        
        List<People> peopleList = new ArrayList<>();
        peopleList.add(p);
        peopleList.add(people);
        peopleList.add(std);
        
        for (People people1 : peopleList) {
            people1.running();
        }
    }
}
