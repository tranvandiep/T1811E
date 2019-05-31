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
public class PersonTeacherMain {
    public static void main(String[] args) {
//        teacher.inputInfo();
//        teacher.showInfo();
//        teacher.calculateFee();
        PersonTeacherList tc = new PersonTeacherList();
        int flag = 0;
        int chose = 0;
        int nextOrNo = 0;
        
        do {
            int check = tc.Menu();
            if(flag == 0 && check != 4) {
                if(check != 1) {
                    System.out.println("Phai nhap danh sach giao vien truoc");
                }
                chose = 1;
            } else {
                chose = check;
            }
            switch(chose) {
                case 1:
                    if(flag == 0) {
                        tc.inputInfo();
                    } else {
                        tc.addInfo();
                    }
                    break;
                case 2:
                    tc.showInfo();
                    break;
                case 3:
                    tc.searchMaxFee();
                    break;
                case 4:
                    break;
            }
            flag++;
            if(chose != 4) {
                nextOrNo = tc.nextOrNo();
            } else {
                break;
            }
        } while(chose != 4 && nextOrNo != 0);
    }
}
