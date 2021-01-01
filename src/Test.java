import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        Methods methods = new Methods();
        var choice = 0;
        var listHotels = new ArrayList<Hotel>();
        do {
            System.out.println("1: Them Phong");
            System.out.println("2: Hien Thi Thong Tin");
            System.out.println("3: Thanh Toan Tien Phong");
            System.out.println("0: Thoat Truong Trinh");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    listHotels.add(methods.ceat(input));
                    break;
                case 2:
                    if (listHotels.size() > 0) {
                        methods.display(listHotels);
                    } else {
                        System.out.println("Danh Sach Rong");
                    }
                    break;
                case 3:
                    if (listHotels.size() > 0) {
                        System.out.println("Nhap CMTND");
                        var cmt = input.nextLine();
                        methods.Payroom(listHotels, cmt);
                    }else {
                        System.out.println("Danh Sach Rong");
                    }
                    break;
            }
        } while (true);
    }
}
