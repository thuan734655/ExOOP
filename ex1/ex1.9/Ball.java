public class Ball {
    private float X;
    private float Y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        X = x;
        Y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        Y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void  move() {
        X += xDelta;
        Y+= yDelta;
    }
    public void reflectHorizontal() {
        xDelta = xDelta*-1;
    }
    public void reflectVertical() {
        yDelta = yDelta*-1;
    }

    @Override
    public String toString() {
        return "Ball[(" +X + "," + Y +"),speed=(" + xDelta +"," + yDelta +")]";

    }
}
