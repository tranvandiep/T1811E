/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carStop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import vehicle.Vehicle;

/**
 *
 * @author PC
 */
public class Zone {
    private int zoneId;
    List<List> zone = new ArrayList<>();
    List<Area> area = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public Zone() {
    }

    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }
    
    public void inputZone() {
        System.out.print("Nhap so luong Area: ");
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++) {
            Area area = new Area();
            area.inputAreaInfo();
            this.area.add(area);
        }
        zone.add(this.area);          
    }
    
    public void displayZone() {
        for(List list : zone) {
            List<Vehicle> vehicleList = list;
            System.out.printf("Co %d xe trong Area\n", vehicleList.size());
            for(Vehicle vehicle : vehicleList) {
                vehicle.displayVehicle();
            }
        }
    }
    
    public Zone(int zoneId) {
        this.zoneId = zoneId;
    }
}
