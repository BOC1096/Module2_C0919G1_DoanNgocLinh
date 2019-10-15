package B1_NgonNguLapTrinhJava.TH_B11TinhChiSoCanNangCoThe;

import java.util.Scanner;

public class TH_B11TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter height");
        double height = input.nextDouble();
        System.out.println("enter weight");
        double weight = input.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        String notice;
        if (bmi >= 30.0) {
            notice = "Obese";
        } else if (bmi >= 25.0) {
            notice = "Overweight";
        } else if (bmi >= 18.5) {
            notice = "Normal";
        } else {
            notice = "Underweight";
        }
        System.out.println(notice);
    }
}
