package B4_KeThua.BT_B3LopPointVaLopMoveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(3, 6);
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint(3, 3, 10, 29);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
