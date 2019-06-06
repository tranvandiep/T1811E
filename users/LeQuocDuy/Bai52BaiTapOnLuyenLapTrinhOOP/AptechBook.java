/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai52BaiTapOnLuyenLapTrinhOOP;

/**
 *
 * @author Duy Lumiere
 */
public class AptechBook extends Book{
        private String language;
        private int semester;

        public AptechBook(String bookName, String producer, int yearPublishing, float price) {
            super(bookName, producer, yearPublishing, price);
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

        @Override
        public void display() {
            super.display(); 
        }

        @Override
        public void input(String bookName, String producer, int yearPublishing, float price) {
            super.input(bookName, producer, yearPublishing, price); 
        }
        
        
        
        
        
        
        
        
}
