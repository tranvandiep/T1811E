/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class Computer {
    String name;
    String cpu;
    String ram;
    String memory;
    String cardVga;

    public Computer() {
    }

    public Computer(String name, String cpu, String ram, String memory, String cardVga) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.memory = memory;
        this.cardVga = cardVga;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCardVga() {
        return cardVga;
    }

    public void setCardVga(String cardVga) {
        this.cardVga = cardVga;
    }

    @Override
    public String toString() {
        return "Computer{" + "name=" + name + ", cpu=" + cpu + ", ram=" + ram + ", memory=" + memory + ", cardVga=" + cardVga + '}';
    }

    void input(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ten Computer : ");
        setName(scanner.nextLine());
        
        System.out.println("Nhap thong so CPU : ");
        setCpu(scanner.nextLine());
        
        System.out.println("Nhap thong so Ram : ");
        setRam(scanner.nextLine());
        
        System.out.println("Nhap thong so bo nho : ");
        setMemory(scanner.nextLine());
        
        System.out.println("Nhap loai card VGA : ");
        setCardVga(scanner.nextLine());
    }
    
    void display(){
        System.out.println(toString());
    }
}
