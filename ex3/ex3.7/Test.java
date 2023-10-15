public class Test {
    public static void main(String[] args) {
         Ball ball = new Ball(1.0f, 2.0f, 3.0f);
         System.out.println("Initial position: " + ball.toString());
         ball.setXYZ(4.0f, 5.0f, 6.0f);
         System.out.println("New position: " + ball.toString());
         System.out.println(ball.getX()); // 4.0
         System.out.println(ball.getY()); // 5.0
         System.out.println(ball.getZ()); //6.0

        //  Player
        System.out.println("teset PLayer");
        Player player1 = new Player(10, 5.0f, 5.0f);
        Player player2 = new Player(7, 10.0f, 10.0f);

        Ball balls = new Ball(7.0f, 6.0f, 1.0f);

        player1.move(2.0f, 2.0f);
        player2.jump(3.0f);

        System.out.println("Player 1 is near the ball: " + player1.near(balls));
        System.out.println("Player 2 is near the ball: " + player2.near(balls));

        player1.kick(balls);
        player2.kick(balls);

    }
    }

