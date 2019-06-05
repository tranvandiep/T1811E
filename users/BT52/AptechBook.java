/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt52;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class AptechBook extends Book {

    private String language;
    private int semester;

    public AptechBook() {
    }

    public AptechBook(String language, int semester, String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        super(bookName, bookAuthor, producer, yearPublishing, price);
        this.language = language;
        this.semester = semester;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getLanguage() {
        return language;
    }

    public int getSemester() {
        return semester;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.   
        Scanner input = new Scanner(System.in);
        System.out.println("ngon ngu");
        language = input.nextLine();
        System.out.println("hoc ky");
        semester = Integer.parseInt(input.nextLine());
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("ngon ngu " + language);
        System.out.println("hoc ky " + semester);
    }
}
