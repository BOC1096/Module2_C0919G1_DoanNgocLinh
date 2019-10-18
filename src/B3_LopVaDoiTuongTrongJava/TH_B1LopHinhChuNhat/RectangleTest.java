package B3_LopVaDoiTuongTrongJava.TH_B1LopHinhChuNhat;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter height: ");
        int height = input.nextInt();
        System.out.println("enter width: ");
        int width = input.nextInt();

        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Print rectangle");
        rectangle.display();
    }
}
