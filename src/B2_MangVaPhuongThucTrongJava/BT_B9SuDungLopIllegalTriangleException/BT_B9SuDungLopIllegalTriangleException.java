package B2_MangVaPhuongThucTrongJava.BT_B9SuDungLopIllegalTriangleException;

import java.util.Scanner;

public class BT_B9SuDungLopIllegalTriangleException {
    public static boolean checkTriangle(double a, double b, double c) {
        if (a + b < c || a + c < b || b + c < a || a < 0 || c < 0 || b < 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        while (true) {
            System.out.print("nhap vao 3 canh cua tam giac: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            try {
                if (checkTriangle(a, b, c)) {
                    throw new IllegalTriangleException();
                }
                System.out.println("chu vi tam giac la" + (a + b + c));
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}