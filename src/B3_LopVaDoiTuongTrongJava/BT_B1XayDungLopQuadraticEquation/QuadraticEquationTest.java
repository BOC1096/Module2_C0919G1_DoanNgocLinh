package B3_LopVaDoiTuongTrongJava.BT_B1XayDungLopQuadraticEquation;

import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = null;
        System.out.println("nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("nhap c: ");
        double c = scanner.nextDouble();

        QuadraticEquation pt1 = new QuadraticEquation(a, b, c);
        if (pt1.getA() == 0) {
            if (pt1.getB() == 0) {
                if (pt1.getC() == 0) {
                    result = "phuong trinh vo so nghiem";
                } else {
                    result = "phuong trinh vo nghiem";
                }
            } else {
                result = "phuon trinh co nghiem la x:" + (-pt1.getC() / pt1.getB());
            }
        } else if (pt1.getDiscriminant() == 0) {
            result = "phuong trinh co nghiem kep x: " + (-pt1.getB() / (2 * pt1.getA()));
        } else if (pt1.getDiscriminant() > 0) {
            result = "phuong trinh co 2 nghiem la:" + pt1.getRoot1() + " va " + pt1.getRoot2();
        } else {
            result = "phuong trinh vo nghiem";
        }
        System.out.println(result);
    }
}
