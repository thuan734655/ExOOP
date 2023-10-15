public class Test {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(3, 4, 5);
        MyCircle circle2 = new MyCircle(new MyPoint(1, 2), 3);
        MyCircle circle3 = new MyCircle();

        System.out.println("Circle 1: " + circle1.toString());
        System.out.println("Circle 2: " + circle2.toString());
        System.out.println("Circle 3: " + circle3.toString());

        System.out.println("Area of Circle 1: " + circle1.getArea());
        System.out.println("Circumference of Circle 2: " + circle2.getCircumference());

        System.out.println("Distance between Circle 1 and Circle 2: " + circle1.distance(circle2));
        System.out.println("radius " +circle1.getRadius());
        System.out.println("center " + circle1.getCenter());
        System.out.println("centerX " + circle1.getCenterX());


    }
}

