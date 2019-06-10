/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.lession3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diep.Tran
 */
public class Test {
    public static void main(String[] args) {
        //length : 5, index : 0 -> length - 1 = 4
//        int[] t = new int[5];
//        t[0] = 3;
//        t[1] = 6;
//        t[4] = 10;
////        t[5] = 123; -> error
//        
//        float[] f = new float[10];
//        String[] s = new String[100];
//        char[] c = new char[9];
//        
//        for (int i = 0; i < t.length; i++) {
//            t[i] = i * 2;
//        }
//        
//        for (int i = 0; i < t.length; i++) {
//            System.out.printf("\nt[%d] = %d", i, t[i]);
//        }
        ArrayList<Integer> t = new ArrayList<>();
        t.add(123);
        t.add(43);
        t.add(43);
        t.add(43);
        t.add(43);
        
//        System.out.println(t.size());
//        
//        System.out.println(t.get(2));
        
        for (int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i));
        }
        
        ArrayList<String> s = new ArrayList<>();
        
        Student[] students = new Student[100];
        
        ArrayList<Student> studentList = new ArrayList<>();
        
        Student std1 = new Student("Tran Van A");
        studentList.add(std1);
        
        Student std2 = new Student("Tran Van B");
        studentList.add(std2);
        
        for (int i = 0; i < studentList.size(); i++) {
            Student std = studentList.get(i);
            
            std.display();
        }
    }
}
