package B4_KeThua.TH_B1HeCacDoiTuongHinhHoc;

public class Shape {
    String color = "green";
    boolean filled = true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + this.color + " and " +
                (this.filled ? "filled" : "not filled");
    }
}
