public class Ball {
    private  float x;
    private  float y;
    private  float radius;
    private float Xdelta;
    private  float Ydelta;

    public Ball( float x,  float y,  float radius,  float speed, float direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        float angleInRadians =(float) Math.toRadians(direction);
        Xdelta = speed * (float)Math.cos(angleInRadians);
        Ydelta = -speed *(float) Math.sin(angleInRadians);
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

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getXdelta() {
        return Xdelta;
    }

    public void setXdelta(float xdelta) {
        Xdelta = xdelta;
    }

    public float getYdelta() {
        return Ydelta;
    }

    public void setYdelta(float ydelta) {
        Ydelta = ydelta;
    }
    public void move() {
        x += Xdelta;
        y += Ydelta;
    }
    public void reflectHorizontal() {
        Xdelta *= -1;
    }
    public void reflectVertical() {
        Ydelta *= -1;
    }
    public String toString() {
        return "Ball[(" +x + "," + y + ")" + ",speed=(" + Xdelta + "," + Ydelta + ")]";
    }
}
