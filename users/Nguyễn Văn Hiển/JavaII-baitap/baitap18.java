/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.DataStructure;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author PC
 */
class studentObj implements Serializable {
     private int id;
     private String name;
     private int age;
     private String address;
     private double gpa;

    public studentObj() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void inputStd() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ma sinh vien: ");
        this.id = Integer.parseInt(input.nextLine());
        System.out.print("Ho va ten: ");
        this.name = input.nextLine();
        System.out.print("Tuoi: ");
        this.age = Integer.parseInt(input.nextLine());
        System.out.print("Dia chi: ");
        this.address = input.nextLine();
        System.out.print("Diem trung binh: ");
        this.gpa = Double.parseDouble(input.nextLine());
    }
    
    public void showStd() {
        System.out.println("Ma sinh vien: " +id +toString());
    }

    @Override
    public String toString() {
        return (name +"-" +age +"-" +address +"-" +gpa);
    }
    
    
    
    public studentObj(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }
}

public class baitap18 {
    
    public static HashMap inputStdList() {
        Scanner input = new Scanner(System.in);
        HashMap stdList = new HashMap();
        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++) {
            studentObj std = new studentObj();
            System.out.printf("Nhap sinh vien thu %d:\n", (i+1));
            std.inputStd();
            stdList.put(std.getId(), std);
        }
        return stdList;
    }
    
    public static void showStdList(HashMap list) {
//        Set set = list.entrySet();
//        System.out.println(set);
//        Iterator ite = list.entrySet().iterator();
//        while(ite.hasNext()) {
//            System.out.println(ite.next());
//        }
        list.forEach((keyInt, valueObject) -> System.out.println("Ma sinh vien: "+keyInt +" " +valueObject));
    }
    
    public static void editById(HashMap list) {
        Scanner input = new Scanner(System.in);
//        Set set = list.entrySet();
//        Iterator iteStd = list.entrySet().iterator();
        System.out.print("Nhap ma sinh vien can sua thong tin: ");
        int id = Integer.parseInt(input.nextLine());
//        while(iteStd.hasNext()) {
//            Map.Entry entry = (Map.Entry)iteStd.next();
//            list.replace(id, entry.setValue());
//            System.out.println(iteStd.next());
//        }
        studentObj std = new studentObj();
        std.inputStd();
        list.replace(id, std);
        showStdList(list);
    }
    
    public static void delById(HashMap list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien can xoa thong tin: ");
        int id = Integer.parseInt(input.nextLine());
        list.remove(id);
        showStdList(list);
    }
    
    public static void sortByGpa(HashMap list) {
        Collection<studentObj> std = list.values();
        List<studentObj> stdList = new ArrayList<studentObj>(std);
        Collections.sort(stdList, new Comparator<studentObj>() {
            @Override
            public int compare(studentObj o1, studentObj o2) {
               if(o1.getGpa() < o2.getGpa()) {
                   return 1;
               } else {
                   if(o1.getGpa() == o2.getGpa()) {
                       return 0;
                   } else {
                       return -1;
                   }
               }
            }     
        });
        stdList.forEach((student) -> {
            student.showStd();
        });
    }
    
    public static void sortByName(HashMap list) {
        Collection<studentObj> std = list.values();
        List<studentObj> stdList = new ArrayList<studentObj>(std);
        Collections.sort(stdList, new Comparator<studentObj>() {
            @Override
            public int compare(studentObj o1, studentObj o2) {
                return(o1.getName().compareTo(o2.getName()));
            }
        });
        stdList.forEach((student) -> {
           student.showStd(); 
        });
    }
    
    public static void writeToFile(HashMap list) {
        Collection<studentObj> std = list.values();
        List<studentObj> stdList = new ArrayList<studentObj>(std);
        studentObj[] stdArr = new studentObj[stdList.size()];
        stdArr = stdList.toArray(stdArr);
//        for(int i = 0; i < stdArr.length; i++) {
//            System.out.println(stdArr[i].toString());
//        }
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/PC/OneDrive/Documents/NetBeansProjects/1811E-Java/src/pkg1811e/java/stdlist.txt");
            ObjectOutputStream objos = new ObjectOutputStream(fos);
            objos.writeObject(stdArr);
            objos.close();
        } catch(IOException ioe) {
            System.out.println("Save error");
        } 
    }
    
    public static void readFromFile() {
        studentObj[] stdArr = null;
        try {
            FileInputStream fis = new FileInputStream("C:/Users/PC/OneDrive/Documents/NetBeansProjects/1811E-Java/src/pkg1811e/java/stdlist.txt");
            ObjectInputStream objis = new ObjectInputStream(fis);
            stdArr = (studentObj[])objis.readObject();
            objis.close();
        } catch(IOException ioe) {
            System.out.println("Read Error");
        } catch(ClassNotFoundException e) {
            System.out.println("Not found");
        }
        for(int i = 0; i < stdArr.length; i++) {
            System.out.println(stdArr[i].toString());
        }
    }
    
    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HashMap stdList = new HashMap();
        stdList = inputStdList();
        showStdList(stdList);
        editById(stdList);
        delById(stdList);
        sortByGpa(stdList);
        writeToFile(stdList);
        readFromFile();

    }
}
