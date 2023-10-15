public class test {
    public static void main(String[] args) {

        MyPoint v1 = new MyPoint(4,8);
        MyPoint v2 = new MyPoint(3,5);
        MyRectangle MR = new MyRectangle(v1,v2);

        System.out.println(MR);// to String

        System.out.println(MR.getArea()); // getArea
        System.out.println(MR.getHeight()); // getHeight
        System.out.println(MR.getWidth()); // getWidth
        
    }
}