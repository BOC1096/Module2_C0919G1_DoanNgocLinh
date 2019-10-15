package B1_NgonNguLapTrinhJava.BT_B4HienThi20SoNguyenToDauTien;

public class BT_B4HienThi20SoNguyenToDauTien {
    private static boolean checkPrime(int num) {
        boolean check = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int count = 0, number = 2;
        while (true) {
            if (number == 2) {
                System.out.println(number);
                count++;
                number++;
                continue;
            }
            if (checkPrime(number)) {
                System.out.println(number);
                count++;
            }
            if (count == 20) {
                break;
            }
            number = number + 2;
        }
    }
}

