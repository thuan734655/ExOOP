public class Container {
    private int x1,y1,x2,y2;

    public Container(int x, int y,int width, int height) {
        this.x1 = x;
        this.y1 = y;
        x2 = x1 + width - 1;
        y2 = y1 + height - 1;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getWidth() {
        return x2;
    }

    public int getHeight() {
        return y2;
    }
    public boolean collidesWith(Ball ball) {
        if (ball.getX() - ball.getRadius() < x1 || ball.getX() + ball.getRadius() > x2 || ball.getY() - ball.getRadius() < y1 || ball.getY() + ball.getRadius() > y2) {

            if (ball.getX() - ball.getRadius() <= x1 || ball.getX() + ball.getRadius() >= x2) {
                ball.reflectHorizontal();
            }
            if (ball.getY() - ball.getRadius() < y1 || ball.getY() + ball.getRadius() > y2) {
                ball.reflectVertical();
            }
            return true;
        }
        return false;
    }
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }

}
