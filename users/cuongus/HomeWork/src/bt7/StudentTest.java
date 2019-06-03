/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt7;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class StudentTest {
    public static void main(String[] args) {
      ArrayList<Student> studentList = new ArrayList<>();
      int choose;
      Scanner input = new Scanner(System.in);
      do{
          showMenu();
          System.out.println("Choose: ");
          choose = Integer.parseInt(input.nextLine());
          
          switch(choose){
            case 1:
                int n;
                System.out.println("Nhap so sinh vien can them: ");
                n = Integer.parseInt(input.nextLine());
                for (int i = 0; i < n; i++) {
                    Student std = new Student();
                    std.inputInfo();
                    studentList.add(std);
                }
                break;
            case 2:
                for (int i = 0; i < studentList.size(); i++) {
                    studentList.get(i).showInfo();
                }
                break;
            case 3:
                int minIndex = 0, maxIndex = 0;
                float minDiem, maxDiem;
                minDiem = studentList.get(0).getDiem();
                maxDiem = studentList.get(0).getDiem();
                for (int i = 1; i < studentList.size(); i++) {
                    if(studentList.get(i).getDiem() < minDiem){
                        minIndex = i;
                        minDiem = studentList.get(i).getDiem();
                    }
                    if(studentList.get(i).getDiem() > maxDiem){
                        maxIndex = i;
                        maxDiem = studentList.get(i).getDiem();
                    }
                }
                System.out.println("Sinh vien co diem trung binh cao nhat: ");
                studentList.get(maxIndex).showInfo();
                System.out.println("Sinh vien co diem trung binh co nhat: ");
                studentList.get(minIndex).showInfo();
                break;
            case 4:
                System.out.println("Nhap ma sinh vien can tim kiem: ");
                String maSVSearch = input.nextLine();
                int count = 0;
                for (int i = 0; i < studentList.size(); i++) {
                    if(studentList.get(i).getMaSV().equals(maSVSearch)){
                        studentList.get(i).showInfo();
                        count++;
                    }
                    if (count == 0){
                        System.out.println("Khong co sinh vien nao trung voi maSV vua nhap.");
                    }
                }
                break;
            case 5:
                Collections.sort(studentList, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        int cmp = o1.getFullName().compareTo(o2.getFullName());
                        if (cmp >=0){
                            return 1;
                        }
                        return -1;
                    }
                    
                });
                 for(int i = 0; i < studentList.size() ; i++){
                     studentList.get(i).showInfo();
                }
                break;
            case 6:
                 Collections.sort(studentList, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getDiem() >= o2.getDiem()?-1:1;
                    }
                    
                });
                 for(int i = 0; i < studentList.size() ; i++){
                     if(studentList.get(i).checkHocbong()){
                         studentList.get(i).showInfo();
                     }
                }
                break;
            case 7:
                System.out.println("Goodbye!!!");
                break;    
            default:
                System.err.println("Nhap sai!!!");
                break;
            
          }
      }while(choose != 7);
    }
    static void showMenu(){
        System.out.println("1. Nhap vao thong tin n sinh vien. ");
        System.out.println("2. Hien thi thong tin sinh vien.  ");
        System.out.println("3. Sinh vien co diem TB cao nhat, sinh vien co diem TB thap nhat.  ");
        System.out.println("4. Tim sinh vien theo ma sinh vien.");
        System.out.println("5. Hien thi ten sinh vien A->Z.");
        System.out.println("6. Hien thi sinh vien dat hoc bong.");
        System.out.println("7. Thoat.");
      }
}
