/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.mark;

import Bai56.StudentAptech;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class StudentMarkTotal extends StudentMark {

    private String StuId;

    private int totalExamSubject;

    private float everageMark;

    public StudentMarkTotal() {
    }

    public StudentMarkTotal(String StuId, int totalExamSubject, float everageMark) {
        this.StuId = StuId;
        this.totalExamSubject = totalExamSubject;
        this.everageMark = everageMark;
    }

    public String getStuId() {
        return StuId;
    }

    public boolean setStuId(String StuId) {
        StudentAptech stdA = new StudentAptech();
        if (stdA.getStuId() != null) {
            this.StuId = StuId;
            return true;
        } else {
            System.err.print("None student.");
            return false;
        }
    }

    public int getTotalExamSubject() {
        return totalExamSubject;
    }

    public void setTotalExamSubject(int totalExamSubject) {
        this.totalExamSubject = totalExamSubject;
    }

    public float getEverageMark() {
        return everageMark;
    }

    public void setEverageMark(float everageMark) {
        this.everageMark = everageMark;
    }

    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("Input Total Exam Subject: ");
        totalExamSubject = Integer.parseInt(input.nextLine());
        System.out.print("Input Everage Mark: ");
        everageMark = input.nextFloat();
    }

    @Override
    public void dishplay() {
        super.dishplay();
        System.out.print(toString());
        System.out.print(" ");
    }

    @Override
    public String toString() {
        return "StudentMarkTotal{" + "StuId=" + StuId + ", totalExamSubject=" + totalExamSubject + ", everageMark=" + everageMark + '}';
    }

}
