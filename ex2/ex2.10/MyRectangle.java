public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getWidth() {
        return Math.abs(topLeft.getX() - bottomRight.getX());
    }

    public double getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    @Override
    public String toString() {
        return "MyRectangle [TopLeft: " + topLeft + ", BottomRight: " + bottomRight + "]";
    }
}
