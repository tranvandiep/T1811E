/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT52_Bai_tap_on_luyen_lap_trinh_OOP;

/**
 *
 * @author linhn
 */
public class AptechBook extends Book {
    private String language;
    private int semester;
    public AptechBook(String language, int semester, String bookName,
                      String bookAuthor, String producer,
                      int yearPublishing, float price) {
        super(bookName, bookAuthor, producer, yearPublishing, price);
        this.language = language;
        this.semester = semester;
    }
    public AptechBook() {
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
    
}
