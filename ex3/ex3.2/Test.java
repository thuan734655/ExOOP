public class Test {
    public static void main(String[] args) {

        MyPolynomial poly1 = new MyPolynomial(1, 2, 3); // 3x^2 + 2x + 1
        MyPolynomial poly2 = new MyPolynomial(4, 5, 6); // 6x^2 + 5x + 4

        System.out.println("Polynomial 1: " + poly1);
        System.out.println("Polynomial 2: " + poly2);

        // Test getDegree()
        System.out.println("Degree of Polynomial 1: " + poly1.getDegree());
        System.out.println("Degree of Polynomial 2: " + poly2.getDegree());

        // Test evaluate()
        double x = 2.0;
        System.out.println("Evaluate Polynomial 1 at x = " + x + ": " + poly1.evaluate(x));
        System.out.println("Evaluate Polynomial 2 at x = " + x + ": " + poly2.evaluate(x));

        // Test add()
        MyPolynomial sum = poly1.add(poly2);
        System.out.println("Sum of Polynomial 1 and Polynomial 2: " + sum);

        // Test multiply()
        MyPolynomial product = poly1.multiply(poly2);
        System.out.println("Product of Polynomial 1 and Polynomial 2: " + product);

        // Test subtract()
        MyPolynomial difference = poly1.subtract(poly2);
        System.out.println("Difference of Polynomial 1 and Polynomial 2: " + difference);

    }
    }

