/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiassignment81;
import baiassignment81.IAuthor;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Author implements IAuthor {
    Scanner input = new Scanner(System.in);
    private String authorName;
    private int authorAge;
    private String authorPseu;
    private String authorBirth;
    private String authorHome;

    public Author() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getAuthorAge() {
        return authorAge;
    }

    public void setAuthorAge(int authorAge) {
        this.authorAge = authorAge;
    }

    public String getAuthorPseu() {
        return authorPseu;
    }

    public void setAuthorPseu(String authorPseu) {
        this.authorPseu = authorPseu;
    }

    public String getAuthorBirth() {
        return authorBirth;
    }

    public void setAuthorBirth(String authorBirth) {
        this.authorBirth = authorBirth;
    }

    public String getAuthorHome() {
        return authorHome;
    }

    public void setAuthorHome(String authorHome) {
        this.authorHome = authorHome;
    }

    @Override
    public void input() {
        System.out.print("Nhap ten: ");
        this.authorName = input.nextLine();
        
        try {
            System.out.print("Nhap tuoi: ");
            this.authorAge = Integer.parseInt(input.nextLine());
        } 
        
        catch(Exception e) {
            System.out.println("**Chi duoc nhap so**");
            System.out.print("Nhap lai tuoi: ");
            this.authorAge = Integer.parseInt(input.nextLine());
        }
        
        System.out.print("Nhap but danh: ");
        this.authorPseu = input.nextLine();
        System.out.print("Nhap ngay sinh: ");
        this.authorBirth = input.nextLine();
        System.out.print("Nhap que: ");
        this.authorHome = input.nextLine();
    }

    @Override
    public String toString() {
        return (authorName + " - " + authorAge + " - " + authorPseu + " - " + authorBirth + " - " + authorHome);
    }

    @Override
    public void display() {
        System.out.println(toString());
    }
    
    public Author(String authorName, int authorAge, String authorPseu, String authorBirth, String authorHome) {
        this.authorName = authorName;
        this.authorAge = authorAge;
        this.authorPseu = authorPseu;
        this.authorBirth = authorBirth;
        this.authorHome = authorHome;
    } 
}