import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Methods {

    public static final int POPULAR = 250000;
    public static final int VIP = 500000;
    public static final int SUITE = 700000;

    public Hotel ceat(Scanner input) {
        String format = "dd/MM/yyyy";
        System.out.println("Chon Loai Phong \n1.Binh Dan\n2.Phong Vip\n3.Phong Hang Sang");
        var selections = input.nextInt();
        input.nextLine();

        System.out.println("Nhap Ten");
        var name = input.nextLine();
        System.out.println("Nhap Ngay Sinh");
        Date dateOfBirth = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            dateOfBirth = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Nhap So Chung Minh Thu Nhan Dan");
        var cmt = input.nextLine();
        System.out.println("Nhap So Ngay O");
        var days = Integer.parseInt(input.nextLine());
        Customer customer = new Customer(name, dateOfBirth, cmt);
        switch (selections) {
            case 1:
                return new Hotel(customer, "Binh Dan", POPULAR, days);
            case 2:
                return new Hotel(customer, "Vip", VIP, days);
            case 3:
                return new Hotel(customer, "Hang Sang", SUITE, days);
        }
        return null;
    }

    public void display(ArrayList<Hotel> listHotels) {
        String format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        System.out.printf("%-13s%-13s%-13s%-13s%-13s%-13s\n",
                "Ho Va Ten", "Ngay Sinh", "CMTND", "Loai Phong", "Gia Phong", "So Ngay O");
        for (var index : listHotels) {
            System.out.printf("%-13s%-13s%-13s%-13s%-13s%-13s\n", index.getCustomer().getFullName(),
                    dateFormat.format(index.getCustomer().getDateOfBirth()), index.getCustomer().getCMTND(),
                    index.getKingOfRoom(), index.getPrice(), index.getDays());
        }
    }

    public void Payroom(ArrayList<Hotel> listHotels, String cmt) {
        for (var index : listHotels) {
            if (index.getCustomer().getCMTND().equals(cmt)) {
                System.out.println(index.getCustomer().getFullName() +
                        " So Tien Ban Phai Tra " + index.payRoom() + "VND");
            } else {
                System.out.println("Khong Tim Thay CMT " + cmt);
            }
        }
    }
}
