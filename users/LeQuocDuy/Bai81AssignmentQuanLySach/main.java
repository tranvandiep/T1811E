/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APTECH.Bai81AssignmentQuanLySach;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Duy Lumiere
 */
public class main {
    static Scanner in = new Scanner(System.in);
    static List<Book> BookArr = new ArrayList<>();
    static List<Author> AuthorArr = new ArrayList<>();
    static boolean Check = false; //Duy trì vòng lặp nhập tác giả khi bị trùng bút danh
    static boolean CheckAuthorExist = false; //Kiểm tra bút danh đã tồn tại chưa
    static boolean CheckAuthorExistB = false; //Kiểm tra bút danh nhập theo sách có tồn tại chưa, nếu chưa nhập mới tác giả
    
    public static void main(String[] args) {
        int Choose;
        int BQuantity;
        int AQuantity;
        String PenName;
        
        
        
        int BookFindCount = 0;
        
        do{
            ShowMenu();
            Choose = in.nextInt();
            
            switch(Choose){
                case 1:
                    System.out.print("- Nhập số sách cần thêm: ");
                    BQuantity = in.nextInt();
                    for(int i = 0; i < BQuantity; i++){
                        System.out.println("*Sách thứ " + (i+1) + ": ");
                        AddBook();
                    }
                    
                    break;
                case 2:
                    if(BookArr.isEmpty()==true){
                        System.out.println("Chưa có sách nào được nhập vào, vui lòng quay lại Menu gốc và chọn 1!\n");
                    }
                    else{
                        BookArr.forEach((b)->{
                            b.BookShowInf();
                            System.out.println("");
                        });
                        System.out.println("");
                    };
                    break;
                case 3:
                    System.out.print("- Nhập số tác giả cần thêm: ");
                    AQuantity = in.nextInt();
                    for(int j = 0; j < AQuantity; j++){
                        System.out.println("Tác giả thứ " + (j+1) + ": ");
                        AddAuthor();
                    }
                    System.out.println("");
                    break;
                case 4:
                    if(BookArr.isEmpty()==true){
                        System.out.println("Chưa có sách nào được nhập vào, vui lòng quay lại Menu gốc và chọn 1!\n");
                    }
                    else{
                        in.nextLine();
                        System.out.print("- Nhập bút danh cần tìm: ");
                        PenName = in.nextLine();
                        for (Book b : BookArr) {
                            if(PenName.equalsIgnoreCase(b.getBookPenName())){
                                b.BookShowInf();
                                BookFindCount++;
                            }
                        }
                        if(BookFindCount==0){
                            System.out.println("Không có sách nào khớp với bút danh này!\n");
                        }
                        System.out.println("");
                        BookFindCount=0;
                    };
                    break;
                case 5:
                    if(AuthorArr.isEmpty()==true){
                        System.out.println("Chưa có tác giả nào được nhập vào, vui lòng quay lại Menu gốc và chọn 3!\n");
                    }
                    else{
                        AuthorArr.forEach((a)->{
                            a.AuthorShowInf();
                            System.out.println("");
                        });
                        System.out.println("");
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn nhập sai Menu, vui lòng nhập lại!\n");
            }
        }
        while(true);
        
        
    }
    
    public static void ShowMenu(){
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SÁCH\n");
        System.out.println("1. Nhập thông tin sách");
        System.out.println("2. Hiển thị tất cả sách ra màn hình");
        System.out.println("3. Nhập thông tin tác giả");
        System.out.println("4. Tìm tất cả sách được viết bởi tác giả");
        System.out.println("5. Hiển thị tất cả tác giả ra màn hình");
        System.out.println("6. Thoát");
        System.out.print("Mời bạn chọn: ");
    }
    
    public static void AddAuthor(){
        do{
            Author Tacgia = new Author();
            Tacgia.AuthorInputInf();
            if(AuthorArr.isEmpty()==true){
                AuthorArr.add(Tacgia);
                System.out.println("Nhập tác giả " + Tacgia.getAuthorName() + " thành công!\n");
                Check = false;
            }
            else{
                for (Author a : AuthorArr) {
                    if(Tacgia.getAuthorPenName().equalsIgnoreCase(a.getAuthorPenName())){
                        CheckAuthorExist = true;
                    }
                }
                if(CheckAuthorExist == true){
                    System.out.println("Bút danh này đã tồn tại, vui lòng nhập bút danh khác!\n");
                    Check = true;
                    CheckAuthorExist = false;
                }
                else{
                    AuthorArr.add(Tacgia);
                    System.out.println("Nhập tác giả " + Tacgia.getAuthorName() + " thành công!\n");
                    Check = false;
                    CheckAuthorExist = false;
                }
            }
        }
        while(Check==true);
    }
    
    public static void AddBook(){
        Book Sach = new Book();
        Sach.BookInputInf();
        if(AuthorArr.isEmpty()==true){
            System.out.println("Chưa có tác giả nào trong hệ thống, vui lòng nhập luôn thông tin của tác giả " + Sach.getBookPenName() + ":\n");
            AddAuthor();
            BookArr.add(Sach);
            System.out.println("Nhập Sách " + Sach.getBookName() + " thành công!\n");
            System.out.println("");
        }
        else{//Check hệ thống khi đã có ít nhất 1 tác giả
            for (Author a : AuthorArr) {
                if(Sach.getBookPenName().equalsIgnoreCase(a.getAuthorPenName())){
                    CheckAuthorExistB = true;//Đã có bút danh của Sách đang nhập trùng với bút danh trong hệ thống
                }
            }
            if(CheckAuthorExistB == false){
                System.out.println("Không tồn tại tác giả với bút danh " + Sach.getBookPenName() + " trong hệ thống, vui lòng nhập luôn thông tin tác giả!\n");
                AddAuthor();
            }
            BookArr.add(Sach);
            System.out.println("Nhập sách " + Sach.getBookName() + " thành công!");
            System.out.println("");
        }
    }
}
