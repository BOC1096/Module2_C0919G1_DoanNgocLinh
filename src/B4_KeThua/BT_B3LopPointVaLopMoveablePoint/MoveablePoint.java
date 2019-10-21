package B4_KeThua.BT_B3LopPointVaLopMoveablePoint;


public class MoveablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;
    float[] speed;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float[] speed) {
        this.speed = new float[]{this.xSpeed, this.ySpeed};
    }

    public float[] getSpeed() {
        return this.speed;
    }

    @Override
    public String toString() {
        return "(" + this.x + " , " + this.y + ")" + "Speed= (" + this.xSpeed + " , " + this.ySpeed + ")";
    }

    public MoveablePoint move() {
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }
}
