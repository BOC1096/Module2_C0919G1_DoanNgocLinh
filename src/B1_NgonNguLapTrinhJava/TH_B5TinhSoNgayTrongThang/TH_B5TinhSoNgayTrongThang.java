package B1_NgonNguLapTrinhJava.TH_B5TinhSoNgayTrongThang;

import java.util.Scanner;

public class TH_B5TinhSoNgayTrongThang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month you want count day");
        byte month = scanner.nextByte();
        String dayInMonth;
        switch (month) {
            case 2:
                dayInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30";
                break;
            default:
                dayInMonth = "";
                break;
        }
        if (!dayInMonth.equals("")) {
            System.out.printf("The month'%d' has %s days", month, dayInMonth);
        } else {
            System.out.println("Month invalid");
        }
    }
}