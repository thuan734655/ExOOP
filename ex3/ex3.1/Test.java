public class Test {
    public static void main(String[] args) {

        MyComplex complex1 = new MyComplex(2.0, 3.0);
        MyComplex complex2 = new MyComplex(1.0, 1.0);

        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);

        // Test getter and setter methods
        System.out.println("Real part of Complex 1: " + complex1.getReal());
        System.out.println("Imaginary part of Complex 1: " + complex1.getImag());
        complex1.setReal(4.0);
        complex1.setImag(5.0);
        System.out.println("Updated Complex 1: " + complex1);

        // Test isReal and isImaginary methods
        System.out.println("Complex 1 is real: " + complex1.isReal());
        System.out.println("Complex 2 is imaginary: " + complex2.isImaginary());

        // Test equals methods
        System.out.println("Complex 1 equals (4.0, 5.0): " + complex1.equals(4.0, 5.0));
        System.out.println("Complex 1 equals Complex 2: " + complex1.equals(complex2));

        // Test magnitude and argument methods
        System.out.println("Magnitude of Complex 1: " + complex1.magnitude());
        System.out.println("Argument of Complex 1: " + complex1.argument());

        // Test addInto, addNew, subtract, subtractNew, multiply, divide, and conjugate methods
        complex1.addInto(complex2);
        System.out.println("After adding Complex 2 into Complex 1: " + complex1);

        MyComplex sum = complex1.addNew(complex2);
        System.out.println("Sum of Complex 1 and Complex 2 (new object): " + sum);

        complex1.subtract(complex2);
        System.out.println("After subtracting Complex 2 from Complex 1: " + complex1);

        MyComplex difference = complex1.subtractNew(complex2);
        System.out.println("Difference of Complex 1 and Complex 2 (new object): " + difference);

        complex1.multiply(complex2);
        System.out.println("After multiplying Complex 1 by Complex 2: " + complex1);

        MyComplex division = complex1.divide(complex2);
        System.out.println("Division of Complex 1 by Complex 2: " + division);

        complex1.conjugate();
        System.out.println("Conjugate of Complex 1: " + complex1);

    }
    }

