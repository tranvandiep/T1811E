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
public class PersonStudentMain {
    public static void main(String[] args) {
//        PersonStudent student = new PersonStudent();
//        
//        student.inputInfo();
//        student.showInfo();
//        student.checkScholarship(student.getEverage());
        PersonStudentList std = new PersonStudentList();
        int chose = 0;
        int flag = 0;
        int nextOrNo = 0;

        do {
            int check = std.Menu();
            if(flag == 0 && check != 7) {
                if(check != 1) {
                    System.out.println("Phai nhap danh sach sinh vien truoc");
                }
                chose = 1;
            } else {
                chose = check;
            }
            switch(chose) {
                case 1:
                    if(flag == 0) {
                        std.inputStdList();
                    } else {
                        std.addList();
                    }
                    break;
                case 2:
                    std.showStdList();
                    break;
                case 3:
                    std.sortByEverage();
                    break;
                case 4:
                    std.searchById();
                    break;
                case 5:
                    std.sortByName();
                    break;
                case 6:
                    std.showScholarship();
                    break;
                case 7:
                    break;  
            }
            flag++;
            if(chose != 7) {
                nextOrNo = std.nextOrNo();
            } else {
                break;
            }
        } while(chose != 7 && nextOrNo != 0);
    }
}
