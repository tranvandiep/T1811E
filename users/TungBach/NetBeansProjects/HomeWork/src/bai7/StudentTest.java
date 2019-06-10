/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        int choose;
        Scanner scan = new Scanner(System.in);
        do{
            showMenu();
            System.out.println("Choose: ");
            choose = Integer.parseInt(scan.nextLine());
            
            switch(choose){
                case 1:
                    int n;
                    System.out.println("Nhap so sinh vien can them: ");
                    n = Integer.parseInt(scan.nextLine());
                    for( int i = 0; i<n;i++ ){
                        Student std = new Student();
                        std.inputInfo();
                        
                        studentList.add(std);
                    }
                    break;
                case 2:
                    for(int i=0; i<studentList.size(); i ++){
                        studentList.get(i).showInfo();
                    }
                    break;
                case 3:
                    int minIndex = 0, maxIndex = 0;
                    float minMark, maxMark;
                    minMark = studentList.get(0).getMark();
                    maxMark = studentList.get(0).getMark();
                    
                    for (int i = 1; i < studentList.size(); i++){
                        if(studentList.get(i).getMark() < minMark){
                            minIndex = i;
                            minMark = studentList.get(i).getMark();
                        }
                        
                        if(studentList.get(i).getMark() > maxMark){
                            maxIndex = i;
                            maxMark = studentList.get(i).getMark();
                        }
                    }
                    
                    System.out.println("Sinh vien co diem trung binh cao nhat");
                    studentList.get(maxIndex).showInfo();
                    
                    System.out.println("Sinh vien co diem trung binh thap nhat");
                    studentList.get(minIndex).showInfo();
                    break;
                case 4:
                    System.out.println("Nhap rollNo can tim kiem: ");
                    String rollNoSearch = scan.nextLine();
                    int count = 0;
                    for(Student student : studentList){
                        if(student.getRollNo().equalsIgnoreCase(rollNoSearch)){
                            student.showInfo();
                            count++;
                        }
                    }
                    if(count == 0){
                        System.out.println("ko tim thay sinh vien nao");
                    }
                    break;
                case 5:
                    Collections.sort(studentList, new Comparable<Student>() {                      
                        public int compareTo(Student o1, Student o2) {
                            int cmp = o1.getName().compareTo(o2.getName());
                            if(cmp >= 0) {
                                return -1;
                            }
                            return 1;
                        }
                    });
                    for (int i = 0; i < studentList.size();i++){
                        studentList.get(i).showInfo();
                    }
                    break;
                case 6:
                    Collections.sort(studentList, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getMark() >= o2.getMark()?-1:1;
                }
            });
                    
                    for(int i = 0; i < studentList.size(); i++){
                        if(studentList.get(i).checkScholarship()){
                           studentList.get(i).showInfo();
                        }
                    }
                    break;
                case 7:
                    System.out.println("Goodbye!!");
                    break;
                default:
                    System.out.println("Nhap sai!!!");
                    break;
            }
        }while(choose != 7);
    }
    
    static void showMenu(){
        System.out.println("1. Nhap vao N sinh vien");
        System.out.println("2. Hien thi thong tin sinh vien");
        System.out.println("3. Hien thi max va min theo diem trung binh");
        System.out.println("4. Tim kiem theo msv");
        System.out.println("5. Sort A-Z theo ten sinh vien va hien thi");
        System.out.println("6. Hien thi sv dc hoc bong & sort mark giam dan");
    }
}
