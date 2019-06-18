/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai102;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Bai3 {

    String source;

    public Bai3() {
    }

    public Bai3(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        source = input.nextLine();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap N so chuoi:");
        int N = Integer.parseInt(input.nextLine());
        List<Bai3> stringList = new ArrayList();
        List<StringBuilder> stringBuilder = new ArrayList();

        for (int i = 0; i < N; i++) {
            Bai3 bai3 = new Bai3();
            System.out.printf("Nhap chuoi thu %d", i + 1);
            bai3.input();

            stringList.add(bai3);
        }

        String[] sourceSplit = bai3.getSource().split("\\s");

        int count = 0;
        for (int i = 0; i < sourceSplit.length; i++) {
            if (bai3.getSearching().equalsIgnoreCase(sourceSplit[i])) {
                count++;
            }
        }

        System.out.printf("Co %d tu '%s' trong chuoi '%s'.", count, bai1.searching, bai1.source);
    }
}
