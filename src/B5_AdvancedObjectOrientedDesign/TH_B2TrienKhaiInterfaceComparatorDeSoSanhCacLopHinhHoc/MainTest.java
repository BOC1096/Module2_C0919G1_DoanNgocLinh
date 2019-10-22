package B5_AdvancedObjectOrientedDesign.TH_B2TrienKhaiInterfaceComparatorDeSoSanhCacLopHinhHoc;

import java.util.Arrays;
import java.util.Comparator;

public class MainTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new Circle();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(3,4);
        rectangles[1] = new Rectangle(6,8);
        rectangles[2] = new Rectangle(4, 5,"red", false);

        System.out.println("Pre-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
        Comparator rectangleComparator = new Rectangle();
        Arrays.sort(rectangles, rectangleComparator);

        System.out.println("After-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }


    }
}
