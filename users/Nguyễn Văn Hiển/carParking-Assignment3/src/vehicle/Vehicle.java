/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class Vehicle {
    private String brand;
    private String license;
    private int manufacture;
    private int ownerId;
    private int length;
    private int width;
    Scanner input = new Scanner(System.in);

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getManufacture() {
        return manufacture;
    }

    public void setManufacture(int manufacture) {
        this.manufacture = manufacture;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
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
    
    
    
    public void input() {
        System.out.print("Hang xe: ");
        this.brand = input.nextLine();
        System.out.print("Bien so: ");
        this.license = input.nextLine();
        System.out.print("Nam san xuat: ");
        this.manufacture = Integer.parseInt(input.nextLine());
        System.out.print("Ma khach hang: ");
        this.ownerId = Integer.parseInt(input.nextLine());
        System.out.print("Chieu rong xe: ");
        this.length = Integer.parseInt(input.nextLine());
        System.out.print("Chieu dai xe: ");
        this.width = Integer.parseInt(input.nextLine());
    }

    public int getAcreage() {
        int S = this.length*this.width;
        return S;
    }
    
    public String fullStt() {
        String s = "Full";
        return s;
    }
    
    public String emptyStt() {
        String s = "Empty";
        return s;
    }
    
    public String toString() {
        return (brand +" - BKS: " +license +" - Sx: " +manufacture +" - ID KH: " +ownerId +" - Dai: " +length +"m, rong: " +width +"m"+"\n");
    }
    
    public void displayVehicle() {
        System.out.print(toString());
    }

    public Vehicle(String brand, String license, int manufacture, int ownerId, int length, int width) {
        this.brand = brand;
        this.license = license;
        this.manufacture = manufacture;
        this.ownerId = ownerId;
        this.length = length;
        this.width = width;
    }
    
}
