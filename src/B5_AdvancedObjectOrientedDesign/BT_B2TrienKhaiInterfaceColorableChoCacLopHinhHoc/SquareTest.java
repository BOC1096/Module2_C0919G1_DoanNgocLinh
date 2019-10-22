package B5_AdvancedObjectOrientedDesign.BT_B2TrienKhaiInterfaceColorableChoCacLopHinhHoc;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(3,5);
        shapes[1] = new Square(6);
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println("Area: " + ((Rectangle) shape).getArea());
            }
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }

        }
    }
}
