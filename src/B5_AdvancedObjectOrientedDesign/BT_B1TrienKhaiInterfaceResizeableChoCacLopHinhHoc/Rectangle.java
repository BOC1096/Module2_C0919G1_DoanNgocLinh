package B5_AdvancedObjectOrientedDesign.BT_B1TrienKhaiInterfaceResizeableChoCacLopHinhHoc;

public class Rectangle extends Shape {
    private double width = 2.0;
    private double length = 4.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of " + " Area: " + getArea()
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("A Area of Shape after resize: " + (this.getArea() + this.getArea() * percent / 100));
    }
}
