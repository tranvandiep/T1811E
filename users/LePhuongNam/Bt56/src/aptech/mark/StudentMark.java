/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.mark;

import aptech.IMark;
import java.util.Scanner;

/**
 *
 * @author hlamg
 */
public class StudentMark implements IMark{
    
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

    public void setStuId(String StuId) {
        this.StuId = StuId;
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
    public String toString() {
        return "StudentMark{" + "StuId=" + StuId + ", className=" + className + ", subjectName=" + subjectName + ", semester=" + semester + ", mark=" + mark + '}';
    }
    
    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Set id : ");
        setStuId(scanner.nextLine());
    }

    @Override
    public void display() {
        System.out.println(toString());
    }
    
}
