public class Test {
     public static void main(String[] args) {
          Ball ball = new Ball(100.5f, 100.3f, 10, 5.3f, 45.0f);

          System.out.println(ball.toString());

          ball.move();
          System.out.println(ball.toString());

          ball.reflectVertical();
          System.out.println(ball.toString());

          ball.reflectHorizontal();
          System.out.println(ball.toString());

          ball.move();
          System.out.println(ball.toString());

          // test Container
          System.out.println("Test Container");
          Container container = new Container(0, 0, 200, 100);
          Ball bal = new Ball(100, 50, 10, 5, 45);
          System.out.println(container.toString());
          System.out.println(container.collidesWith(ball)); // Should return false
          ball.setX(210);
          System.out.println(container.collidesWith(ball)); // Should return true
          System.out.println(ball.toString());
     }
}

