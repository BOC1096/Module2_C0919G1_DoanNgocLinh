package B4_KeThua.BT_B2LopPoint2DvaLopPoint3D;

public class Ponint2D {
    private float x = 0.0f;
    private float y = 0.0f;
    private float[] xy;

    public Ponint2D() {
    }

    public Ponint2D(float x, float y) {
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
