package B4_KeThua.BT_B2LopPoint2DvaLopPoint3D;

import java.util.Arrays;

public class Ponint3D extends Ponint2D {
    private float z = 0.0f;
    private float[] xyz;

    Ponint3D() {
    }

    Ponint3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float[] xyz) {
        this.xyz = new float[]{this.getX(), this.getY(), this.getZ()};
    }

    public float[] getXYZ() {
        return this.xyz;
    }

    @Override
    public String toString() {
        return Arrays.toString(xyz);
    }
}
