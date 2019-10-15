package B1_NgonNguLapTrinhJava.TH_B1HienThiThoiGianHeThong;

import java.util.Calendar;
import java.util.Date;

public class TH_B1HienThiThoiGianHeThong {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Now is: " + now);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
    }
}

