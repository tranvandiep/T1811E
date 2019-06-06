/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanlysinhvien;

/**^
 *
 * @author HP ENVY
 */
public class Main {
    public static void main(String[] args) {
        StudentMark s1 = new StudentMark();
        StudentMark s2 = new StudentMark();
        
        s1.input();
        s2.input();
        s1.display();
        s2.display();
        
        
        System.out.println("SINH VIEN CO THANH TICH TOT NHAT: \n");
        if(s1.getMark() > s2.getMark()) {
            s1.display();
        } else if(s1.getMark() < s2.getMark()){
            s2.display();
        } else
            System.out.println("2 hoc sinh co cung diem so");
    }
}

