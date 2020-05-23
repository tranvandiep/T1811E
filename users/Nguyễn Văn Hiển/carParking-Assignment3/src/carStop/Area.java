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
public class Area {
    private int length;
    private int width;
    private int areaLocation;
    
    Car car = new Car();
    Container con = new Container();
    Scanner input = new Scanner(System.in);

    public Area() {
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
    
    public void inputAreaInfo() {
        System.out.print("Nhap vi tri Area: ");
        this.areaLocation = Integer.parseInt(input.nextLine());
        System.out.print("Nhap chieu dai Area: ");
        this.length = Integer.parseInt(input.nextLine());
        System.out.print("Nhap chieu rong Area: ");
        this.width = Integer.parseInt(input.nextLine());  
        
        int S = this.length*this.width;
        int s = 0;
        int leng = 0;
        int wid = 0;
        
        List<Vehicle> arr1 = new ArrayList();
        
        for(int i = 0; s < S; i++) {
            Car car = new Car();
            arr1.add(car);
            s = s + car.getCarLeng()*car.getCarWid();
//            leng = leng + arr1.get(i).getLength();
            leng = leng + (int)(car.crossCarLeng());
//            wid = wid + arr1.get(i).getWidth();
            wid = wid + (int)(car.getCarWid());
            if(i%2 != 0) {
                s+=3*this.width;
            }
        }
        
        for(Vehicle vehicle : arr1) {
            System.out.print(vehicle.emptyStt()+"   ");
        }
        
        int l = 0;
        int w = 0;
        Vehicle[][] arr = new Vehicle[0][0];
        for(int i = 0; l < leng; i++) {
            for(int j = 0; w < wid; j++) {
                arr[i][j] = arr1.get(i+j);
                l = arr[i][j].getLength() + l;
                w = arr[i][j].getWidth() + w;
            }      
        }
        for(int i = 0; l < leng; i++) {
            for(int j = 0; w < wid; j++) {
                l = arr[i][j].getLength() + l;
                w = arr[i][j].getWidth() + w;
                System.out.print(arr[i][j].fullStt()+"  ");
            }      
            System.out.println("\t");
        }
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
    
    public Area(int length, int width, int areaLocation) {
        this.length = length;
        this.width = width;
        this.areaLocation = areaLocation;
    }

    
}
