package B4_KeThua.BT_B2LopPoint2DvaLopPoint3D;

import java.util.Arrays;

public class Ponint3D extends Ponint2D {
    float z = 0.0f;
    float[] xyz;

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
        this.xyz = new float[]{this.x, this.y, this.z};
    }

    public float[] getXYZ() {
        return this.xyz;
    }
    @Override
    public String toString(){
        return Arrays.toString(xyz);
    }
}
