package B1_NgonNguLapTrinhJava.TH_B6KiemTraSoNguyenTo;

import java.util.Scanner;

public class TH_B6KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number want check");
        int num = scanner.nextInt();
        if (num < 2) {
            System.out.println(num + " is'n Prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(num + "is Prime");
            } else {
                System.out.println(num + "is'n Prime");
            }
        }
    }
}