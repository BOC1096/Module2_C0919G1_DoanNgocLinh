package B4_KeThua.TH_B1HeCacDoiTuongHinhHoc;

public class ShapeTest {
    public static void main(String[] args) {
        // tao doi tuong circle
        Circle circle = new Circle(4.5, "blue", false);
        System.out.println(circle.toString());
        //tao doi tuong rectangle
        Rectangle rectangle = new Rectangle("green", true, 5, 10);
        System.out.println(rectangle.toString());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        //tao doi tuong square
        Square square = new Square(5, "red", true);
        System.out.println(square);
        System.out.println("Area of square: " + square.getWidth());
    }
}
