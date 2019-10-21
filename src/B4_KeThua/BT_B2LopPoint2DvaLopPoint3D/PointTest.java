package B4_KeThua.BT_B2LopPoint2DvaLopPoint3D;

public class PointTest {
    public static void main(String[] args) {
        Ponint3D ponint3D = new Ponint3D(3, 5, 7);
        ponint3D.setXYZ(ponint3D.xyz);
        System.out.println(ponint3D.toString());
    }
}
