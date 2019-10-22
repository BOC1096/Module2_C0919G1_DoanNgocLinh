package B5_AdvancedObjectOrientedDesign.TH_B2TrienKhaiInterfaceComparatorDeSoSanhCacLopHinhHoc;

import java.util.Comparator;

public class Rectangle extends Shape implements Comparator<Rectangle> {
    private double width = 1.0;
    private double length = 1.0;

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
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        if (r1.getArea() > r2.getArea()) return 1;
        else if (r1.getArea() < r2.getArea()) return -1;
        else return 0;
    }
}

