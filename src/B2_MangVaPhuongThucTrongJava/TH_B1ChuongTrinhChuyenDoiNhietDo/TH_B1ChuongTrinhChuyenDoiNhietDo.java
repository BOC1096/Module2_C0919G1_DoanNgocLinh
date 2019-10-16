package B2_MangVaPhuongThucTrongJava.TH_B1ChuongTrinhChuyenDoiNhietDo;

import java.util.Scanner;

public class TH_B1ChuongTrinhChuyenDoiNhietDo {
    static double doCsangF(double c) {
        return (9.0 / 5) * c + 32;
    }

    static double doFsangC(double f) {
        return (5.0 / 9) * (f - 32);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doF,doC;
        int choice;
        while (true){
            System.out.println("1. Chuyen tu do C sang F");
            System.out.println("2. Chuyen tu do F sang C");
            System.out.println("3. Exit");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap do C: ");
                    doC = input.nextDouble();
                    System.out.println(doCsangF(doC)+" do F");
                    break;
                case 2:
                    System.out.println("Nhap do F: ");
                    doF = input.nextDouble();
                    System.out.println(doFsangC(doF)+" do C");
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("faill");
                    break;
            }
        }
    }
}
