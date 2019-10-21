package B4_KeThua.BT_B1LopCircleVaLopCylinder;

public class Cylinder extends Circle {
  private   double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder: Radius: " + this.getRadius() + " Height: " + this.height +
                " Color: " + this.color + " Volume: " + this.getVolume();
    }

}
