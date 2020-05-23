/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
class Student {
    private String stdRollNo;
    private String name;
    private double mark;

    public Student() {
    }

    public String getStdRollNo() {
        return stdRollNo;
    }

    public void setStdRollNo(String stdRollNo) {
        this.stdRollNo = stdRollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void inputStd() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ma sinh vien: " +getStdRollNo());
        System.out.print("Ho va ten: ");
        this.name = input.nextLine();
        System.out.print("Diem so: ");
        this.mark = Double.parseDouble(input.nextLine());      
    }
    
    public void displayStd() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return (stdRollNo +" - " +name + " - " +mark);
    }
    
    public Student(String stdRollNo, String name, double mark) {
        this.stdRollNo = stdRollNo;
        this.name = name;
        this.mark = mark;
    }
}

class ShareData {
    String data;
    List<Student> valid = new ArrayList<>();
    List<String> invalid = new ArrayList<>();
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Student> getValid() {
        return valid;
    }

    public void setValid(String data) {
        Student std = new Student();
        std.setStdRollNo(data);
        std.inputStd();
        valid.add(std);
    }

    public List<String> getInvalid() {
        return invalid;
    }

    public void setInvalid(String data) {
        invalid.add(data);
    }
    
}

class SortRollNo extends Thread {
    ShareData data = new ShareData();

    public SortRollNo(ShareData data) {
        this.data = data;
    }

    @Override
    public void run() {
        String regex = "^[CTN][0-9]{4}[GHIKLM]{1}[V]{0,1}[0-9]{4}";
        try {
            FileReader fr = new FileReader("C:/Users/PC/OneDrive/Documents/NetBeansProjects/1811E-Java/src/pkg1811e/java/students.txt");
            BufferedReader br = new BufferedReader(fr);
            String rollNo = br.readLine();
            synchronized(data) {    
                while(rollNo != null) {
                    data.setData(rollNo);
                    if(data.getData().matches(regex)) {                     
                        data.setValid(rollNo);
                    } else {
                        data.setInvalid(rollNo);
                    }
                    data.notify();
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SortRollNo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    rollNo = br.readLine();
                }
            }
            fr.close();
            br.close();
            synchronized(data) {
                data.notifyAll();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SortRollNo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SortRollNo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class ValidRollNo extends Thread {
    ShareData valid = new ShareData();
    List<Student> validList = new ArrayList<>();
    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ValidRollNo(ShareData data) {
        this.valid = data;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ValidRollNo.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized(valid) {
            try {
                for(int i = 0; i < getCount(); i++) {
                    validList = valid.getValid();
                    System.out.println("\nChao mung sinh vien: " +valid.getData());
                    int n = validList.size();
                    validList.get(n-1).displayStd();
                    System.out.println("Danh sach co " +n +" sinh vien");
                    FileWriter fw = new FileWriter("C:/Users/PC/OneDrive/Documents/NetBeansProjects/1811E-Java/src/pkg1811e/java/testdata/" +valid.getData() +".dat");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(valid.getData());
                    bw.newLine();
                    bw.flush();
                    bw.write(valid.getValid().get(n-1).getName());
                    bw.newLine();
                    bw.flush();
                    bw.write((int)(valid.getValid().get(n-1).getMark()));

                    bw.close();
                    fw.close();
                    valid.notify();
                    try {
                        valid.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ValidRollNo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(ValidRollNo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
}

class InvalidRollNo extends Thread {
    ShareData invalid = new ShareData();
    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public InvalidRollNo(ShareData data) {
        this.invalid = data;
    }

    @Override
    public void run() {
    FileWriter fw = null;
        try {
            fw = new FileWriter("C:/Users/PC/OneDrive/Documents/NetBeansProjects/1811E-Java/src/pkg1811e/java/invalid.txt");
            synchronized(invalid) {
                for(int i = 0; i < getCount(); i++) {
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(invalid.getData());
                    bw.flush();
                    System.out.println("Ma sv khong hop le: " +invalid.getData() +"\n");
                    invalid.notify();
                    try {
                        invalid.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(InvalidRollNo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(InvalidRollNo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(InvalidRollNo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        synchronized(invalid) {
            invalid.notifyAll();
        }          
    } 
}

public class baitap59 {
    public static Integer[] inputRollNoFile() {
        Scanner input = new Scanner(System.in);
        String regex = "^[CTN][0-9]{4}[GHIKLM]{1}[V]{0,1}[0-9]{4}";
        Integer[] arr = new Integer[2];
        int valid = 0;
        int invalid = 0;
        
        try {
            FileWriter fw = new FileWriter("C:/Users/PC/OneDrive/Documents/NetBeansProjects/1811E-Java/src/pkg1811e/java/students.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.print("Nhap so luong msv can them: ");
            int n = Integer.parseInt(input.nextLine());
            System.out.println("Nhap ma sinh vien: ");
            for(int i = 0; i < n; i++) {
                System.out.print("Ma sinh vien thu " +(i+1) +": ");
                String rollNo = input.nextLine();
                if(rollNo.matches(regex)) {
                    valid++;
                } else {
                    invalid++;
                }
                bw.write(rollNo);
                bw.newLine();
                bw.flush();
            }
            arr[0] = valid;
            arr[1] = invalid;
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(baitap59.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    
    
    
    public static void main(String[] args) {
        ShareData rollNo = new ShareData();
        ValidRollNo valid = new ValidRollNo(rollNo);
        InvalidRollNo invalid = new InvalidRollNo(rollNo);
        SortRollNo sort = new SortRollNo(rollNo);
        Integer[] arr = new Integer[2];
        
        arr = inputRollNoFile();
        valid.setCount(arr[0]);
        invalid.setCount(arr[1]);
        sort.start();
        if(arr[0] > 0) {
            valid.start();
        } else {
            valid.stop();
        }
        if(arr[1] > 0) {
            invalid.start();
        } else {
            invalid.stop();
        }
        
    }
}
