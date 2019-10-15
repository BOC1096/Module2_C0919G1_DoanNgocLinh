package B1_NgonNguLapTrinhJava.BT_B6UngDungChuyenDoiTienTe;

import java.util.Scanner;

public class BT_B6UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. USD to VND");
        System.out.println("2. VND to USD");
        System.out.println("3. Exit");
        int choice;
        double USD, VND;
        while (true) {
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("please enter USD: ");
                    USD = input.nextDouble();
                    VND = USD * 23000;
                    System.out.println("VND: " + VND + "vnd");
                    break;
                case 2:
                    System.out.println("please enter VND: ");
                    VND = input.nextDouble();
                    USD = VND / 23000;
                    System.out.println("USD: " + USD + "usd");
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("fail!!!");
                    break;
            }
        }
    }
}

