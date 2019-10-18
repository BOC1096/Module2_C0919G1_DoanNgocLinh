package B3_LopVaDoiTuongTrongJava.BT_B1XayDungLopQuadraticEquation;

public class QuadraticEquation {
    //phuong trinh ax^2+bx+c = 0;
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    double getDiscriminant() {
        return this.b * 2 - this.a * this.c * 4;
    }

    double getRoot1() {
        return ((-1 * this.b + Math.sqrt(getDiscriminant())) / (2 * this.a));
    }

    double getRoot2() {
        return ((-1 * this.b - Math.sqrt(getDiscriminant())) / (2 * this.a));
    }
}
