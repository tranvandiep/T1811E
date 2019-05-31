/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.mark;

import Bai56.IMark;
import Bai56.StudentAptech;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class StudentMark implements IMark {

    private String StuId;

    private String className;

    private String subjectName;

    private int semester;

    private float mark;

    public StudentMark() {
    }

    public StudentMark(String StuId, String className, String subjectName, int semester, float mark) {
        this.StuId = StuId;
        this.className = className;
        this.subjectName = subjectName;
        this.semester = semester;
        this.mark = mark;
    }

    public String getStuId() {
        return StuId;
    }

    public boolean setStuId(String StuId) {
        if (StuId != null) {
            this.StuId = StuId;
            return true;
        } else {
            System.err.print("Khong co sinh vien nay.");
            return false;
        }
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Student ID: ");
        while (!setStuId(input.nextLine()));
        System.out.print("Input Class Name: ");
        className = input.nextLine();
        System.out.print("Input Subject Name: ");
        subjectName = input.nextLine();
        System.out.print("Input Semester: ");
        semester = Integer.parseInt(input.nextLine());
        System.out.print("Input Mark: ");
        mark = input.nextFloat();
    }

    @Override
    public void dishplay() {
        System.out.print(toString());
        System.out.print(" ");
    }

    @Override
    public String toString() {
        return "StudentMark{" + "StuId=" + StuId + ", className=" + className + ", subjectName=" + subjectName + ", semester=" + semester + ", mark=" + mark + '}';
    }

}
