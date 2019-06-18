/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai102;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Bai1 {

    String source;
    String searching;

    public Bai1() {
    }

    public Bai1(String source, String searching) {
        this.source = source;
        this.searching = searching;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSearching() {
        return searching;
    }

    public void setSearching(String searching) {
        this.searching = searching;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap chuoi source: ");
        source = input.nextLine();
        System.out.println("Nhap chuoi searching: ");
        searching = input.nextLine();
    }

    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        bai1.input();
        String[] sourceSplit = bai1.getSource().split("\\s");

        int count = 0;
        for (int i = 0; i < sourceSplit.length; i++) {
            if (bai1.getSearching().equalsIgnoreCase(sourceSplit[i])) {
                count++;
            }
        }

        System.out.printf("Co %d tu '%s' trong chuoi '%s'.", count, bai1.searching, bai1.source);
    }
}
