/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package author.cm;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Author implements IAuthor {
    private String authorName;
    private int authorAge;
    private String authorPseu;
    private String authorBirth;
    private String authorHome;
    Scanner input = new Scanner(System.in);

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
        System.out.print("Nhập tên: ");
        this.authorName = input.nextLine();
        try {
            System.out.print("Nhập tuổi: ");
            this.authorAge = Integer.parseInt(input.nextLine());
        } catch(Exception e) {
            System.out.println("Nhập sai quy cách. Chỉ được nhập chữ số.");
            System.out.print("Nhập tuổi: ");
            this.authorAge = Integer.parseInt(input.nextLine());
        }
        System.out.print("Nhập bút danh: ");
        this.authorPseu = input.nextLine();
        System.out.print("Nhập ngày sinh: ");
        this.authorBirth = input.nextLine();
        System.out.print("Nhập quê quán: ");
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
