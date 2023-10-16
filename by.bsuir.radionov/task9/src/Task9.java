import java.awt.*;

public class Task9 {
    public static void main(String[] args) {
        Ball ball1 = new Ball(5, Color.GREEN);
        Ball ball2 = new Ball(6, Color.BLUE);
        Ball ball3 = new Ball(7, Color.GREEN);

        Bucket bucket = new Bucket(22);

        bucket.addBall(ball1);
        bucket.addBall(ball2);
        bucket.addBall(ball3);

        System.out.println(bucket.countBlue());
    }
}
