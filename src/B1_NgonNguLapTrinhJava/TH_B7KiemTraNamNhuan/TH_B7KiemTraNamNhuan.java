package B1_NgonNguLapTrinhJava.TH_B7KiemTraNamNhuan;

import java.util.Scanner;

public class TH_B7KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year: ");
        int year = scanner.nextInt();
        if (year % 4 != 0) {
            System.out.println("Year not leap");
        } else {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("Year not leap");
            } else {
                System.out.println("Year Leap");
            }
        }
    }
}