package B4_KeThua.BT_B3LopPointVaLopMoveablePoint;

public class Point {
    float x = 0.0f;
    float y = 0.0f;
    float[] xy;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float[] xy) {
        this.xy = new float[]{this.x, this.y};
    }

    public float[] getXy() {
        return this.xy;
    }

    @Override
    public String toString() {
        return "(" + this.x + " , " + this.y + ")";
    }
}