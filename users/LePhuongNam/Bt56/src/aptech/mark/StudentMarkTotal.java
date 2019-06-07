/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.mark;

import aptech.IMark;
import java.util.List;

/**
 *
 * @author hlamg
 */
public class StudentMarkTotal implements IMark{
    
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

    public void setStuId(String StuId) {
        this.StuId = StuId;
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
    public String toString() {
        return "StudentMarkTotal{" + "StuId=" + StuId + ", totalExamSubject=" + totalExamSubject + ", everageMark=" + everageMark + '}';
    }
    
    public void getTotalExamSubject(List<StudentMark> list){
        
    };
    
    public void calculateEverageMark(List<StudentMark> list){
        
    };
    
    @Override
    public void input() {
        
    }

    @Override
    public void display() {
        System.out.println(toString());
    }
    
}
