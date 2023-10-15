public class Player {
    private int number;
    private float x,y ,z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public void move (float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }
    public void jump(float zDisp){
        z += zDisp;
    }
    public  boolean near(Ball ball) {
       double temp = Math.sqrt(Math.pow(this.x - ball.getX(),2) +Math.pow(this.y - ball.getY(),2) + Math.pow(this.z - ball.getZ(),2));
       return temp < 8;
    }
    public void kick(Ball ball) {
        if(near(ball)) {
            System.out.println("vao!!!");
        }
        else {
            System.out.println("kh vao!!");
        }
    }

}
