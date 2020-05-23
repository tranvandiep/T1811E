/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carStop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import vehicle.Car;
import vehicle.Container;
import vehicle.Vehicle;

/**
 *
 * @author PC
 */
public class Area1 {
    private int length;
    private int width;
    private int areaLocation;
    
    Car car = new Car();
    Container con = new Container();
    Scanner input = new Scanner(System.in);

    public Area1() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getAreaLocation() {
        return areaLocation;
    }

    public void setAreaLocation(int areaLocation) {
        this.areaLocation = areaLocation;
    }
    
    public Vehicle[][] inputAreaInfo() {
        System.out.print("Nhap vi tri Area: ");
        this.areaLocation = Integer.parseInt(input.nextLine());
        System.out.print("Nhap chieu dai Area: ");
        this.length = Integer.parseInt(input.nextLine());
        System.out.print("Nhap chieu rong Area: ");
        this.width = Integer.parseInt(input.nextLine());      
        int x;
        int y;
        int Scar;
        int Scon;
        double s1 = 0;
        double s2 = 0;
        int S = this.length*this.width;
      
        Scon = con.getConLeng()*con.getConWid();
        Scar = car.getCarLeng()*car.getCarWid();
        x = (int)(this.length/(car.crossCarLeng()+3));           
        y = (int)((this.width-2*car.crossCarLeng())/(car.getCarWid()+2));

        Vehicle[][] arr = new Vehicle[x][y];
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                Vehicle car = new Car();
                arr[i][j] = car;
                s1 = s1 + 3*3;
//                s1 = s1 + car.getLength()*car.getWidth();
            }
        }
        System.out.println(s1);
        for(int i = 0; i < x; i++) {
            for(int j = 0; s2 < s1 && j < y; j++) {
                Vehicle con = new Container();           
                arr[i][j] = con;
                s2 = s2 + 4*5;
//                s2 = s2 + con.getLength()*con.getWidth();
                if(s2 > s1) {
                    Vehicle car = new Car();
                    arr[i][j] = car;
                }
                
                for(int k = i; k >= 0; k--) {
                    int L = 0;
                    if(arr[k][j] == con) {
                        L = L;
                        if(L > this.length) {
                            Vehicle car = new Car();
                            arr[k][j] = car;
                            break;
                        }
                    }
                } 
            }
        
        }
        System.out.println(s2);
        
        
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                if(arr[i][j].getClass().equals(Car.class)) {
                    if(arr[i][j].getLicense() == null) {
                        car.displayCar(car.emptyStt());
                    } else {
                        car.displayCar(car.fullStt());
                    }
                    
                } else {
                    if(arr[i][j].getLicense() == null) {
                        con.displayCon(con.emptyStt());
                    } else {
                        con.displayCon(con.fullStt());
                    }
                }
            }           
            System.out.println("\n");
        }
        
        return arr;
    }
    
    public void showArea(Vehicle[][] arr, int x, int y) {
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                if(arr[i][j].getClass().equals(Car.class)) {
                    if(arr[i][j].getLicense() == null) {
                        car.displayCar(car.emptyStt());
                    } else {
                        car.displayCar(car.fullStt());
                    }
                    
                } else {
                    if(arr[i][j].getLicense() == null) {
                        con.displayCon(con.emptyStt());
                    } else {
                        con.displayCon(con.fullStt());
                    }
                }
            }           
            System.out.println("\n");
        }
    }
    
//    public void inputVehicle(int[][] arr) {
//        for (int[] arr1 : arr) {
//            List<Vehicle> vehicleArr = new ArrayList<>();
//            Vehicle vehicle = new Vehicle();
//            vehicle.input();
//            vehicleArr.add(vehicle);
//            arr1 = vehicel
//        }   
//    }
    
   
    public void displayAreaVehicle(List<Vehicle> list) {
        list.forEach((vehicle) -> {
            vehicle.displayVehicle();
        });
    }
    
    public void sortByVehicleAcreage(List<Vehicle> list) {
        int a, b;
        Collections.sort(list, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                int a = o1.getLength()*o1.getWidth();
                int b = o2.getLength()*o2.getWidth();
                if(a < b) {
                    return 1;
                } else if(a == b) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    } 
    
    public Area1(int length, int width, int areaLocation) {
        this.length = length;
        this.width = width;
        this.areaLocation = areaLocation;
    }

    
}
