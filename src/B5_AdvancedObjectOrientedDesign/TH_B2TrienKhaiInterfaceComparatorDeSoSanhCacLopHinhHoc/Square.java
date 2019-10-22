package B5_AdvancedObjectOrientedDesign.TH_B2TrienKhaiInterfaceComparatorDeSoSanhCacLopHinhHoc;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        super.setLength(size);
        super.setWidth(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setLength(double length) {
        setSize(length);
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }
}
