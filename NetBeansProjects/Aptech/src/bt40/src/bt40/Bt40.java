package bt40;
 
import java.util.Scanner;
 
public class Bt40 {
	public static void main(String[] args) {
            String name = null;
            int age = 0;
            String address = null;
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		do {
			System.out.printf("Chọn chức năng tu 1 den 3: ");
			int chon = Integer.parseInt(input.nextLine());
			switch (chon) {
			case 1:
				System.out.printf("Nhap thong tin sinh vien:\n");
                                System.out.printf("Nhap ten: ");
                                name = input.nextLine();
                                System.out.printf("Nhap tuoi: ");
                                age = Integer.parseInt(input.nextLine());
                                System.out.printf("Nhap dia chi: ");
                                address = input.nextLine();
				break;
			case 2:
				System.out.printf("In thong tin sinh vien");
                                System.out.printf("Ten: %s\n",name);
                                System.out.printf("Tuoi: %d",age);
                                System.out.printf("Dia chi: %s", address);
				break;
			default:
				System.out.println("Tạm biệt");
				cont = false;
				break;
			}
		} while (cont);
	}
}