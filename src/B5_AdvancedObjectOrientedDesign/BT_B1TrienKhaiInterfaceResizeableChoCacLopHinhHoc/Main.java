package B5_AdvancedObjectOrientedDesign.BT_B1TrienKhaiInterfaceResizeableChoCacLopHinhHoc;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(5,10);
        shapes[1] = new Square(10);
        shapes[2] = new Circle(3);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            shapes[i].resize(getRandom());
        }
    }
    public static int getRandom() {
        return ((int) (Math.random() * 100) + 1);
    }
}
