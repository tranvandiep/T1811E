/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai52;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class AptechBook extends Book {

    private String language;

    private int semester;

    public AptechBook() {
    }

    public AptechBook(String language, int semester) {
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

    public AptechBook(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        super(bookName, bookAuthor, producer, yearPublishing, price);
    }

    public AptechBook(String language, int semester, String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        super(bookName, bookAuthor, producer, yearPublishing, price);
        this.language = language;
        this.semester = semester;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ngon ngu: ");
        language = input.nextLine();
        System.out.print("Nhap ky hoc: ");
        semester = input.nextInt();
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.print(toString());
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "AptechBook{" + "language=" + language + ", semester=" + semester + '}';
    }

}
