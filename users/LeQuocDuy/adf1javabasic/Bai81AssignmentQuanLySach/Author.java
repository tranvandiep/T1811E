/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf1javabasic.Bai81AssignmentQuanLySach;
import java.util.Scanner;
/**
 *
 * @author Duy Lumiere
 */
public class Author {
    Scanner in = new Scanner(System.in);
    
    private String AuthorName;
    private int AuthorAge;
    private String AuthorPenName;
    private String AuthorBirthday;
    private String AuthorHometown;
    
    /**
     *
     */
    public Author(){
        
    }

    public Author(String AuthorName, int AuthorAge, String AuthorPenName, String AuthorBirthday, String AuthorHometown) {
        this.AuthorName = AuthorName;
        this.AuthorAge = AuthorAge;
        this.AuthorPenName = AuthorPenName;
        this.AuthorBirthday = AuthorBirthday;
        this.AuthorHometown = AuthorHometown;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    public int getAuthorAge() {
        return AuthorAge;
    }

    public void setAuthorAge(int AuthorAge) {
        this.AuthorAge = AuthorAge;
    }

    public String getAuthorPenName() {
        return AuthorPenName;
    }

    public void setAuthorPenName(String AuthorPenName) {
        this.AuthorPenName = AuthorPenName;
    }

    public String getAuthorBirthday() {
        return AuthorBirthday;
    }

    public void setAuthorBirthday(String AuthorBirthday) {
        this.AuthorBirthday = AuthorBirthday;
    }

    public String getAuthorHometown() {
        return AuthorHometown;
    }

    public void setAuthorHometown(String AuthorHometown) {
        this.AuthorHometown = AuthorHometown;
    }
    
    public void AuthorInputInf(){
        System.out.println("NHẬP THÔNG TIN TÁC GIẢ: ");
        System.out.print("- Nhập tên tác giả: ");
        this.AuthorName = in.nextLine();
        System.out.print("- Nhập tuổi của tác giả: ");
        this.AuthorAge = in.nextInt();
        in.nextLine();
        System.out.print("- Nhập bút danh của tác giả: ");
        this.AuthorPenName = in.nextLine();
        System.out.print("- Nhập ngày sinh của tác giả: ");
        this.AuthorBirthday = in.nextLine();
        System.out.print("- Nhập quê quán của tác giả: ");
        this.AuthorHometown = in.nextLine();
    }
    
    public void AuthorShowInf(){
        System.out.println("THÔNG TIN CỦA TÁC GIẢ: ");
        System.out.println("- Tên tác giả là: " + getAuthorName());
        System.out.println("- Tuổi: " + getAuthorAge());
        System.out.println("- Bút danh: " + getAuthorPenName());
        System.out.println("- Ngày sinh: " + getAuthorBirthday());
        System.out.println("- Quê quán: " + getAuthorHometown());
    }
    
    
}
