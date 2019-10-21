package B4_KeThua.BT_B4ThietKeVaTrienKhaiLopTriangle;

import B4_KeThua.TH_B1HeCacDoiTuongHinhHoc.Shape;

public class Triangle extends Shape {
    double size1 = 1.0, size2 = 1.0, size3 = 1.0;

    Triangle() {
    }

    Triangle(double size1, double size2, double size3, String color, boolean filled) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double Perimeter() {
        return this.size1 + this.size2 + this.size3;
    }

    //tinh dien tich tam giac bang cong thuc Heron
    public double Area() {
        return Math.sqrt((this.Perimeter() / 2) * (this.Perimeter() / 2 - this.size1) * (this.Perimeter() / 2 - this.size2) * (this.Perimeter() / 2 - this.size3));
    }

    @Override
    public String toString() {
        return "Triangle: (" + "Color: " + this.getColor() + "Filled: " + (this.isFilled() ? "is filled" : "is not filled") +
                "Perimeter: " + this.Perimeter() + "Area: " + this.Area() + ")";
    }
}
