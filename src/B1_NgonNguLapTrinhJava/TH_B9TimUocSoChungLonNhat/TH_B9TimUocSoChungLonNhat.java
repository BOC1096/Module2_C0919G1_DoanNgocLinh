package B1_NgonNguLapTrinhJava.TH_B9TimUocSoChungLonNhat;

import java.util.Scanner;

public class TH_B9TimUocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number a");
        int a = input.nextInt();
        System.out.println("enter number b");
        int b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) {
            if (b == 0) {
                System.out.println("No greatest common factor");
            } else {
                System.out.println("Greatest common factor: " + b);
            }
        } else {
            if (b == 0) {
                System.out.println("Greatest common factor: " + a);
            } else {
                while (a != b) {
                    if (a > b) {
                        a = a - b;
                    } else {
                        b = b - a;
                    }
                }
                System.out.println("Greatest common factor: " + a);
            }
        }

    }
}