/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt51;

import java.util.Scanner;

/**
 *
 * @author anthony_jsc
 */
public class AptechBook extends Book {
    private String language;
    private int semester;
    
    public AptechBook(){
    
    }

    public AptechBook(String language, int semester) {
        this.language = language;
        this.semester = semester;
    }

    public AptechBook(String language, int semester, String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        super(bookName, bookAuthor, producer, yearPublishing, price);
        this.language = language;
        this.semester = semester;
    }
    //Getter
    public String getLanguage() {
        return language;
    }

    public int getSemester() {
        return semester;
    }
    //Setter
    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSemester(int semester) {
        this.semester = semester;   
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        super.input(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap ngon ngu: ");
        language = input.nextLine();
        System.out.println("Nhap ky hoc: ");
        semester = Integer.parseInt(input.nextLine());
//        while (semester <= 0){
//            System.out.println("Nhap lai ky hoc voi so nguyen duong: ");
//        semester = Integer.parseInt(input.nextLine());
//        }
    }
//
    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
      
    }
 
      
}
