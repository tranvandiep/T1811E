/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Aptechbook extends Book{
    private String language;
    private int semester;
    public Aptechbook() {
        
    }

    public Aptechbook(String language, int semester, String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        super(bookName, bookAuthor, producer, yearPublishing, price);
        this.language = language;
        this.semester = semester;
    }

    

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    @Override
    public void input(){
        super.input();
    Scanner input =new Scanner(System.in);
    System.out.println("Nhap ngon ngu: ");
    language =input.nextLine();
    System.out.println("Nhap hoc ky: ");
    semester =input.nextByte();
}
    @Override
    public void dislay(){
    toString();
}
    @Override
    public String toString() {
        return "Aptechbook{" + "language=" + language + ", semester=" + semester + '}';
    }

}
