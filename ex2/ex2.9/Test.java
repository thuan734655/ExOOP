public class Test {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(3, 0);
        MyPoint point3 = new MyPoint(0, 4);

        MyTriangle triangle = new MyTriangle(point1, point2, point3);

        System.out.println(triangle.toString());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println(triangle.getType());

    }
    }

