/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.DataStructure;
//
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
//
///**
// *
// * @author PC
// */

class IntData {
    int data;
    int even;
    int odd;

    public int getEven() {
        return even;
    }

    public void setEven(int even) {
        this.even = even;
    }

    public int getOdd() {
        return odd;
    }

    public void setOdd(int odd) {
        this.odd = odd;
    }
    
    public IntData(int data) {
        this.data = data;
    }

    public IntData() {
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

class SortNumber extends Thread {
    IntData data = new IntData();
    
    @Override
    public void run() {
        FileReader fr = null;
        try {
            fr = new FileReader("C:/Users/PC/OneDrive/Documents/NetBeansProjects/1811E-Java/src/pkg1811e/java/intlist.txt");
            BufferedReader br = new BufferedReader(fr);
            synchronized(data) {
                Integer sort;
                while(br.ready()) {
                    sort = Integer.parseInt(br.readLine());
                    System.out.println(sort);
                    if(sort%2 == 0) {
                        data.setEven(sort);
                        data.setData(sort);
                    } else {
                        data.setOdd(sort);
                        data.setData(sort);
                    }
                    data.notifyAll();
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SortNumber.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            System.out.println("t1 ket thuc");
            synchronized(data) {
                data.setData(0);
                data.notifyAll();
            }
            
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SortNumber.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(SortNumber.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public SortNumber(IntData data) {
        this.data = data;
    }
}

class EvenNumber extends Thread {
    IntData even = new IntData();

    @Override
    public void run() {
        try {
            Thread.sleep(10);
            synchronized(even) {
                do {
                    if(even.getEven() == 0) {
                        even.wait();
                    } else {
                        while(even.getEven() != 0) {
                            List arr = new ArrayList<>();
                            System.out.print(even.getEven() +" = ");
                            for(int i = 1; i < even.getEven(); i++) {
                                if(even.getEven()%i == 0) {
                                    arr.add(i);
                                }
                            }
                            for(int i = 0; i < arr.size(); i++) {
                                System.out.print(arr.get(i));
                                if(i < arr.size()-1) {
                                    System.out.print(" + ");
                                }
                            }
                            System.out.println();
                            even.notifyAll();
                            even.setEven(0);
                            even.wait();
                            if(even.getEven() == 0) {
                                break;
                            }
                        }
                    }
                } while(even.getData() != 0);
            }
            System.out.println("t2 ket thuc");
        } catch (InterruptedException ex) {
            Logger.getLogger(EvenNumber.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public EvenNumber(IntData data) {
        even = data;
    }
}

class OddNumber extends Thread {
    IntData odd = new IntData();

    @Override
    public void run() {
        try {
            Thread.sleep(10);
            synchronized(odd) {
                do {
                    if(odd.getOdd() == 0) {
                        odd.wait();
                    } else {
                        while(odd.getOdd() != 0) {
                            System.out.println(odd.getOdd() +"x" +odd.getOdd() +" = " +((int)(Math.pow(odd.getOdd(), 2))));
                            odd.notifyAll();
                            odd.setOdd(0);
                            odd.wait();
                            if(odd.getOdd() == 0) {
                                break;
                            }
                        }
                    }
                } while(odd.getData() != 0);
            }
            System.out.println("t3 ket thuc");
        } catch (InterruptedException ex) {
            Logger.getLogger(OddNumber.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public OddNumber(IntData data) {
        odd = data;
    }
}

public class baitap61 {
    public static void inputData() {
        FileWriter fw = null;

        try {
            Random rd = new Random();
            Vector<Integer> dataList = new Vector<>();
            fw = new FileWriter("C:/Users/PC/OneDrive/Documents/NetBeansProjects/1811E-Java/src/pkg1811e/java/intlist.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Integer a = rd.nextInt(90)+10;
            dataList.add(0, a);
            bw.write(dataList.get(0).toString());
            bw.newLine();
            bw.flush();
            int i = 1;
            while(i < 500) {
                Integer data = rd.nextInt(500)+1;
                int x = 0;
                if(!dataList.contains(data)) {
                    dataList.add(i, data);
                    bw.write(dataList.get(i).toString());
                    bw.newLine();
                    bw.flush();
                    i++;
                } 
            }
            
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(baitap61.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        IntData data = new IntData();
        SortNumber sort = new SortNumber(data);
        EvenNumber even = new EvenNumber(data);
        OddNumber odd = new OddNumber(data);
        
        inputData();
        sort.start();
        even.start();
        odd.start();
    }
}




