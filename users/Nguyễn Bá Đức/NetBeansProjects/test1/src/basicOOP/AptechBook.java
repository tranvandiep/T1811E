/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicOOP;

import java.util.Scanner;

/**
 *
 * @author HP ENVY
 */
public class AptechBook extends Book {

    private String language;
    private int semester;

    public AptechBook(){};
    
    public AptechBook(String language, int semester) {
        super();
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
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Language: ");
        language = input.nextLine();
        System.out.println("Semester: ");
        semester = input.nextInt();
        
    }
    
    public void display() {
        System.out.println("Language: " + language);
        System.out.println("Semester: " + semester);
    }
    

}
