package B1_NgonNguLapTrinhJava.TH_B10UngDungTinhTienLaiChoVay;

import java.util.Scanner;

public class TH_B10UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money , interest_rate;
        int month;
        System.out.println("enter money");
        money = input.nextDouble();
        System.out.println("enter Month");
        month = input.nextInt();
        System.out.println("enter interest");
        interest_rate = input.nextDouble();
        for (int i = 0; i<month;i++){
            money += money*(interest_rate/100);
        }
        System.out.println("total of interest:" + money);
    }
}
