public class Test {
    public static void main (String [] args) {
      
        MyLine line1 = new MyLine (0, 0, 3, 4); // A line from (0, 0) to (3, 4)
        MyLine line2 = new MyLine (1, 2, 1, 2); // A line from (1, 2) to (1, 2)
        MyLine line3 = new MyLine (-2, -3, 4, 5); // A line from (-2, -3) to (4, 5)

        // Test the getBegin() and getEnd() methods
        System.out.println ("The begin point of line1 is " + line1.getBegin ());
        System.out.println ("The end point of line1 is " + line1.getEnd ());
        System.out.println ("The begin point of line2 is " + line2.getBegin ());
        System.out.println ("The end point of line2 is " + line2.getEnd ());
        System.out.println ("The begin point of line3 is " + line3.getBegin ());
        System.out.println ("The end point of line3 is " + line3.getEnd ());

        // Test the setBegin() and setEnd() methods
        line1.setBegin (new MyPoint (1, 1)); // Change the begin point of line1 to (1, 1)
        line2.setEnd (new MyPoint (2, 3)); // Change the end point of line2 to (2, 3)
        System.out.println (" line1, it is " + line1);
        System.out.println (" line2, it is " + line2);

        // Test the toString() method
        System.out.println (" line1 is " + line1);
        System.out.println (" line2 is " + line2);
        System.out.println (" line3 is " + line3);
    }
}

